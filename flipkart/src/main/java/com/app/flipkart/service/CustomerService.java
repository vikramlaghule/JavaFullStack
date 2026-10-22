package com.app.flipkart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.flipkart.entity.Customers;
import com.app.flipkart.exception.UserNotFoundException;
import com.app.flipkart.repository.CustomerRepo;


@Service
public class CustomerService {

	private CustomerRepo repo;
	public CustomerService(CustomerRepo repo)
	{
		this.repo=repo;
	
	}
	
	//1. add user  
	public String addCustomer(Customers user)
	{
		repo.save(user);
		return user.getName()+" saved successfully....";
	}
	
	//2.Get all user
	public List<Customers> getAllCustomerss()
	{
		return repo.findAll();
	}
	
	//3.Get by id
	public Customers getCustomerByID(int id) throws Exception
	{
		return repo.findById(id)
	               .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
		
	}
	
	//4. Get by name
	
	
}
