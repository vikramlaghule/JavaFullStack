package com.upi.googlePay.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.upi.googlePay.Entity.Teachers;
import com.upi.googlePay.Service.TeacherService;

@RestController
public class TeacherController {

	private TeacherService service;
	public TeacherController(TeacherService service)
	{
		this.service=service;
	}
	
	@GetMapping("/add-teacher")
	public String addTeacher(@RequestBody Teachers teach)
	{
		return service.addTeacher(teach);
	}
	
}
