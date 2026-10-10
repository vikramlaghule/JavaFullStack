package com.studentapp.student_management.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentapp.student_management.Dto.StudentDto;
import com.studentapp.student_management.Entity.Student;
import com.studentapp.student_management.Repository.StudentRepo;

@Service
public class StudentService {

	private StudentRepo repo;
	
	public StudentService(StudentRepo repo)
	{
		this.repo=repo;
	}
	
	
	public StudentDto addStudent(Student stud)
	{
		
		Student st=repo.save(stud);
		
		StudentDto s=new StudentDto();
		
		s.setId(st.getId());
		s.setName(st.getName());
		s.setEmail(st.getEmail());
		s.setCourse(st.getCourse());
		s.setAge(st.getAge());
		s.setCity(st.getCity());
		s.setPercentage(st.getPercentage());
		
		
		return s;
	}
	
	public List<Student> getAllStudent()
	{
		
		return repo.findAll();
	}
	
}
