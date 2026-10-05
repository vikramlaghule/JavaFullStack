package com.upi.googlePay.Service;

import org.springframework.stereotype.Service;

import com.upi.googlePay.Entity.Teachers;
import com.upi.googlePay.Repository.TeachRepo;

@Service
public class TeacherService {
	private TeachRepo teach;
	public TeacherService(TeachRepo teach)
	{
		this.teach=teach;
	}
	
	public String addTeacher(Teachers teacher)
	{
		
		teach.save(teacher);
		return  teacher.getName() + " :: saved successfully";
	}
	
	
}
