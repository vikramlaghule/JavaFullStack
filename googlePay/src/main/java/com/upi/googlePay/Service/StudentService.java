package com.upi.googlePay.Service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.upi.googlePay.Entity.Student;
import com.upi.googlePay.Exception.StdudentWithIDNotFound;
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
	   
    public int updadtename(String name, int id) throws StdudentWithIDNotFound
    {
    		if(studentRepository.updateName(name, id)==1)
    		{
    			throw new StdudentWithIDNotFound("Are bhai aaisa koi id nahi hai");
    		}
        return studentRepository.updateName(name, id);
    }
   
   
    public Student getbyname(String name)
    {
        return studentRepository.getbyname(name);
    }
    public boolean deleteStudentById(int id)
    {
       
    	studentRepository.deleteById(id);
       
        return true;
    }
    
}
