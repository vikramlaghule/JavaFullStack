package com.app.flipkart.service;

import org.springframework.stereotype.Service;

import com.app.flipkart.dto.Dtos.custDto;
import com.app.flipkart.entity.Customers;

@Service
public class Mapper {

	
	public custDto toDtos(Customers cust)
	{
		return new custDto(cust.getName(), cust.getMobno(), cust.getMail());
	}
}
