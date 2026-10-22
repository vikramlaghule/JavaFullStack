package com.ganesh.courier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.security.Principal;
import java.time.*;
import java.util.*;

@RestController @RequestMapping("/api")
public class ApiController {
  private final EmployeeRepo emps; private final CompanyRepo cos; private final ConsignmentRepo cons;
  public ApiController(EmployeeRepo e, CompanyRepo c, ConsignmentRepo k) { emps = e; cos = c; cons = k; }

  private Employee who(Principal p) { return emps.findByUsername(p.getName()).orElseThrow(); }

  @GetMapping("/me") public Map<String, String> me(Principal p) {
    Employee e = who(p);
    return Map.of("username", e.username, "name", Objects.toString(e.name, ""), "mobile", Objects.toString(e.mobile, ""));
  }
  @GetMapping("/company") public Company company() { return cos.findById(1L).orElseGet(Company::new); }
  @PutMapping("/company") public Company saveCompany(@RequestBody Company c) { c.id = 1L; return cos.save(c); }

  @GetMapping("/consignments") public List<Consignment> list() { return cons.findAllByOrderByLrNoDesc(); }

  @PostMapping("/consignments") public Consignment create(@RequestBody Consignment c, Principal p) {
    if (c.lrNo == null) c.lrNo = cons.findTopByOrderByLrNoDesc().map(x -> x.lrNo + 1).orElse(1001L);
    if (cons.existsByLrNo(c.lrNo)) throw new ResponseStatusException(HttpStatus.CONFLICT, "This L.R. No. is already used");
    c.id = null;
    c.createdBy = who(p).name;                       // "created by" = logged-in employee
    c.bookDate = LocalDate.now().toString();
    c.bookTime = LocalTime.now().toString().substring(0, 5);
    double sub = c.fr + c.ham + c.dd + c.oth;
    c.gst = Math.round(sub * c.gstp) / 100.0;
    c.tot = Math.round((sub + c.gst) * 100) / 100.0;
    return cons.save(c);
  }
}
