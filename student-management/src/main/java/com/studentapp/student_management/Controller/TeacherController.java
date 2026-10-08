package com.studentapp.student_management.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.student_management.Dto.Stud;
import com.studentapp.student_management.Dto.StudDTo;
import com.studentapp.student_management.Entity.Student;
import com.studentapp.student_management.Entity.Teacher;
import com.studentapp.student_management.Services.TeacherService;

@RestController
@RequestMapping("/t")
public class TeacherController {

	private TeacherService service;
	
	public TeacherController (TeacherService service)
	{
		this.service=service;
	}
	
	@PostMapping("/add-teacher")
	public String addteacher(@RequestBody Teacher teach)
	{
		return service.addTeacher(teach);
		
	}
	@GetMapping("/getAll-teacher")
	public List<Teacher> getAllTeacher()
	{
		
		return service.getAllTeacher();
	}
	
	@GetMapping("/getAll-teach")
	public List<StudDTo> getAllT()
	{
		List<Teacher> list=service.getAllTeacher();
		
		return list.stream().
		map(s->{
			StudDTo dt=new StudDTo();
			dt.setTeachername(s.getTeachername());
			dt.setStudent(convert(s.getStudent()));
			return dt;
		}).toList();
	}
	public List<Stud> convert(List<Student> student) {
	    return student.stream()
	        .map(s -> {
	            Stud st = new Stud();
	            st.setFirst_name(s.getFirst_name());
	            return st;
	        })
	        .toList();
	}
}
