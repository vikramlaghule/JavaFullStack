package com.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.dto.Dtos.studentDTo;
import com.studentmanagement.service.MapperService;
import com.studentmanagement.service.StudentService;

@RestController
public class test {
	
	
	@Autowired
	private MapperService mapper;
	private StudentService service;
	
	
	@GetMapping("/get-all")
	public List<studentDTo> getAll()
	{
		return service.getAllStudent().
				stream().map(mapper::toDTo).toList();
	}

	@GetMapping("/hello")
	public String hello()
	{
		return "hello working";
	}
}
