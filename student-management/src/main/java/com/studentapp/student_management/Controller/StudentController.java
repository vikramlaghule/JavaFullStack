package com.studentapp.student_management.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class StudentController {

	@PostMapping("/test")
	public String getStarted(@RequestParam int id)
	{
		return "Hello";
		
	}
	@PostMapping("/test2/{id}")
	public String requestpara(@PathVariable int id)
	{
		return null;
		
	}
	@GetMapping("/test3")
	public String requestbody(@RequestBody Student stud)
	{
		
		
		return stud.fname +":"+stud.lname;
		
	}
	
}
class Student{
	int id;
	String fname;
	String lname;
}
