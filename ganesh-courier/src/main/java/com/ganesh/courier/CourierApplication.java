package com.ganesh.courier;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourierApplication {
  public static void main(String[] a) { SpringApplication.run(CourierApplication.class, a); }

  // Runs once on an empty database: creates demo employees + default company details.
  @Bean CommandLineRunner seed(EmployeeRepo emps, CompanyRepo cos) {
    return args -> {
      if (emps.count() == 0) {
        emps.save(emp("ramesh", "{noop}ramesh123", "Ramesh Patil", "9822012345"));
        emps.save(emp("sunita", "{noop}sunita123", "Sunita Kulkarni", "9890123456"));
      }
      if (!cos.existsById(1L)) {
        Company c = new Company();
        c.id = 1L; c.name = "Ganesh Courier & Transport"; c.address = "Station Road, Solapur, Maharashtra";
        c.phone = "9370000000"; c.gstin = "27AAAPG0000A1Z5"; c.upi = "ganeshcourier@upi"; c.jur = "Solapur";
        cos.save(c);
      }
    };
  }
  static Employee emp(String u, String p, String n, String m) {
    Employee e = new Employee(); e.username = u; e.password = p; e.name = n; e.mobile = m; return e;
  }
}
