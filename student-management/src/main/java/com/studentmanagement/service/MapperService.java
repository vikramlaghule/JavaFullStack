package com.studentmanagement.service;

import org.springframework.stereotype.Service;

import com.studentmanagement.dto.Dtos.studentDTo;
import com.studentmanagement.entity.Student;

@Service
public class MapperService {

	
	public studentDTo toDTo(Student s)
	{	
		return new studentDTo( s.getName(),s.getAge(),s.getPercentage());
	}
	
	
	
	
	
}
