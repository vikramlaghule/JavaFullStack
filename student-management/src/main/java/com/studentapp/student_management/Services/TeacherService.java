package com.studentapp.student_management.Services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.studentapp.student_management.Entity.Teacher;
import com.studentapp.student_management.Repository.TeacherRepository;

@Service
public class TeacherService {
	
	private TeacherRepository repo;
	TeacherService (TeacherRepository repo)
	{
		this.repo=repo;
	}
	
	public String addTeacher(Teacher teacher)
	{
		repo.save(teacher);
		return teacher.getTeachername()+" saved successfully......";
	}
	
	public List<Teacher> getAllTeacher()
	{
		return repo.findAll();
	}
	
	
}
