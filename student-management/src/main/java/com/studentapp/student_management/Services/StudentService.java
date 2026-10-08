package com.studentapp.student_management.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentapp.student_management.Entity.Student;
import com.studentapp.student_management.Repository.StudentRepo;

@Service
public class StudentService {

	private StudentRepo repo;
	
	public StudentService(StudentRepo repo)
	{
		this.repo=repo;
	}
	public String addStudent(Student stud)
	{
		repo.save(stud);
		return "student added successfully "+stud.getFirst_name()  ;
	}
	public List<Student> getAllStudent()
	{
		
		return repo.findAll();
	}
	
}
