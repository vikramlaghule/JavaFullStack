package com.upi.googlePay.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.upi.googlePay.Entity.Student;
import com.upi.googlePay.Repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	public StudentService(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}
	public String addStudentService(Student stud) throws InterruptedException
	{
		Thread.sleep(5000);
		
		studentRepository.save(stud);
		
		return stud.getFirstname()+ "  this student added successfully";
	}
	public List<Student> getAllStudent()
	{
		return studentRepository.findAll();
		
	}
	
	public Student findById(int id)
	{
		return studentRepository.findById(id).get();
	}
	
}
