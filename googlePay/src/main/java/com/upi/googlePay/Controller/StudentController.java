package com.upi.googlePay.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upi.googlePay.Entity.Student;
import com.upi.googlePay.Exception.StdudentWithIDNotFound;
import com.upi.googlePay.Service.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;


@RestController

public class StudentController {
	
	public StudentService service;
	public StudentController(StudentService service)   //Constructor Injection
	{
		this.service=service;
	}
	
	
//	@Autowired
//	public StudentService service;       Field Injection

	
	@PostMapping("/addUser1")
	public String addUser(@RequestParam(name = "f", required = false, defaultValue = "Vikram") String fname,@RequestParam (value="l",required = false, defaultValue = "Laghule") String lname)
	{
		return fname.toUpperCase()+" "+lname.toUpperCase();
		
	}
	
	@PostMapping("/addUser2/{f}/{l}")
	public String addUser2(@PathVariable(value = "f") String fname,@PathVariable(name = "l")String lname)
	{
	
		return fname.toUpperCase()+" "+lname.toUpperCase();
	}
	
	
	@PostMapping("/addUser3")
	public String addUser3(@RequestBody Student stud) {
		
		return "hello";
	}	
	
	@PostMapping("/add-student")
	public String addStudent(@Valid @RequestBody Student stud) throws InterruptedException
	{
		
		return service.addStudentService(stud);
	}
	
	@GetMapping("/getAll-Student")
	public List<Student> findAllStudent()
	{
		return service.getAllStudent();
	}
	
	@GetMapping("/findbyId/{id}")
	public Student findById(@PathVariable int id  )
	{
		return service.findById(id);
	}
	  @DeleteMapping("/delete-id/{id}")
	    public  boolean delete(@PathVariable(value="id") int id)
	    {
	        return service.deleteStudentById(id);
	    }
	   
	   
	    @PutMapping("/update/{name}/{id}")
	    public int update(@PathVariable(value="name")String name,@PathVariable(value="id")int id) throws StdudentWithIDNotFound
	    {
	       
	        return service.updadtename(name, id);
	    }
	   
	    @GetMapping("/get-by-name/{name}")
	    public Student getname(@PathVariable String name)
	    {
	        return service.getbyname(name);
	    }
	

}

