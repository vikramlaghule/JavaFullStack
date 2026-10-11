package com.studentmanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.dto.StudentDto;
import com.studentmanagement.entity.Student;
import com.studentmanagement.exception.StudentNotException;
import com.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private StudentService service;
	
	public StudentController(StudentService service)
	{
		this.service=service;
	}
	
	//1.add student
	@PostMapping("/add-student")
	public StudentDto addStudent(@RequestBody StudentDto stud)
	{
		
		Student st=new Student();
		st.setName(stud.getName());
		st.setEmail(stud.getEmail());
		st.setCourse(stud.getCourse());
		st.setAge(stud.getAge());
		st.setCity(stud.getCity());
		st.setPercentage(stud.getPercentage());
		
		return service.addStudent(st);
		
	}

	
	//2.get all students
	@GetMapping("/get-students")
	public List<StudentDto> getstudent()
	{
	    List<Student> st = service.getAllStudent();

	    return st.stream().map(s -> {

	        StudentDto dt = new StudentDto();

	        dt.setName(s.getName());
	        dt.setEmail(s.getEmail());
	        dt.setCourse(s.getCourse());
	        dt.setAge(s.getAge());
	        dt.setCity(s.getCity());
	        dt.setPercentage(s.getPercentage());

	        return dt;
	    }).toList();
	}
	
	
	//3. get students by id.
	@GetMapping("/getBy-Id{id}")
	public StudentDto getById(@PathVariable(value="id") int id) throws StudentNotException
	{
		return service.getById(id);
	}
	
	
	
	
}	
	

