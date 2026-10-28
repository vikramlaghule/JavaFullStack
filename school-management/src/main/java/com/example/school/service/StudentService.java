package com.example.school.service;

import com.example.school.entity.Student;
import com.example.school.repository.SchoolRepository;
import com.example.school.repository.StudentRepository;
import com.example.school.repository.TeacherRepository;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final SchoolRepository schoolRepository;
    private final TeacherRepository teacherRepository;
    private final StudentRepository studentRepository;

    public StudentService(SchoolRepository schoolRepository,
                   TeacherRepository teacherRepository,
                   StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.teacherRepository = teacherRepository;
        this.studentRepository = studentRepository;
    }

    public Student add(Student student,long teacherId) throws Exception
    {
    	
    
    	
    	student.setTeacher(	teacherRepository.findById(teacherId).orElseThrow(()->
    	new Exception("Enter valid teacher id")));
    	
  
    	
    	studentRepository.save(student);
      	return student;
    	
    }
    
    public List<Student> getAll()
    {
    	return studentRepository.findAll();
    }
   
        		
    
}
