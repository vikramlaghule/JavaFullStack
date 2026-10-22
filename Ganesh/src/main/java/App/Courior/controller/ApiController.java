package App.Courior.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import App.Courior.entity.Consignment;
import App.Courior.service.ConsignmentService;

@RestController
@RequestMapping("/")
public class ApiController {

	private ConsignmentService service;
	
	@GetMapping("/create-consignmet")
	public String addConsignmet(@RequestBody Consignment con)
	{
		return service.saveConsignment(con);
	}
	
	
	
}
