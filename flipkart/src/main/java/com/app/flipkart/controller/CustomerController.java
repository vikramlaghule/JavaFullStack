package com.app.flipkart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.flipkart.dto.CustomerDto;
import com.app.flipkart.dto.Dtos.custDto;
import com.app.flipkart.entity.Customers;
import com.app.flipkart.service.CustomerService;
import com.app.flipkart.service.Mapper;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	private CustomerService service;
	private Mapper mapper;
	
	public CustomerController(CustomerService service,Mapper mapper)
	{
		this.service=service;
		this.mapper=mapper;
	}
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customers cust)
	{
		
		return service.addCustomer(cust);
	}
	
	@GetMapping("/get-all")
	public List<CustomerDto> getAll()
	{
		
		return service.getAllCustomerss().stream()
		.map(s->{
			CustomerDto dt= new CustomerDto();
			dt.setName(s.getName());
			dt.setMobno(s.getMobno());
			dt.setMail(s.getMail());
			return dt;
		}
		).toList();
		
	}
	
	@GetMapping("/{id}")
	public custDto getById(@PathVariable int id) throws Exception
	{

		return	mapper.toDtos(service.getCustomerByID(id));
	
	}
	
	
	
}
