package com.studentapp.student_management.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.student_management.Dto.StudentDto;
import com.studentapp.student_management.Entity.Student;
import com.studentapp.student_management.Services.StudentService;

@RestController
@RequestMapping("/s")
public class StudentController {

	private StudentService service;
	
	public StudentController(StudentService service)
	{
		this.service=service;
	}
	
@PostMapping("/add-student")
public String addStudent(@RequestBody Student stud)
{
	return service.addStudent(stud);
}

	@GetMapping("/getAll-student")
	public List<Student> getAllTeacher()
	{
		return service.getAllStudent();
	}
	
	@GetMapping("/get-students")
	public List<StudentDto> getstudent()
	{
		List<Student> st=service.getAllStudent();
		
		return st.stream().map(s->{
			StudentDto dt=new StudentDto();
			dt.setStudentname(s.getFirst_name());
			dt.setTeachername(s.getTeach().getTeachername());
			return dt;
		}).toList();
		
		
	}
	
}
