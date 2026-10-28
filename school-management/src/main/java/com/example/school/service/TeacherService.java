package com.example.school.service;

import com.example.school.entity.School;
import com.example.school.entity.Teacher;
import com.example.school.repository.SchoolRepository;
import com.example.school.repository.TeacherRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    private  SchoolRepository schoolRepository;
    private  TeacherRepository teacherRepository;
  

    public TeacherService(SchoolRepository schoolRepository,
                   TeacherRepository teacherRepository) {
        this.schoolRepository = schoolRepository;
        this.teacherRepository = teacherRepository;
    }
    
    public String addTeacher(long schoolId, Teacher teacher) throws Exception
    {	
    	
    		School school=	schoolRepository.findById(schoolId).orElseThrow(()->
    			 new Exception("School not found"));
    			
    		teacher.setSchool(school);
    		teacherRepository.save(teacher);
		return teacher.getName()+" saved successsfully....";
    	
    }
    public List<Teacher> getAllTeacher(long schoolId) throws Exception
    {
    	School school=	schoolRepository.findById(schoolId).orElseThrow(()->
		 new Exception("School not found"));
  
    	return	school.getTeachers();
    	
    }
    public Teacher getTeacherById(Long teacherId ) throws Exception
    {
     return	teacherRepository.findById(teacherId).orElseThrow(()->
     new Exception("Teacher not found")
    		 );
    		
    }
    
   

}
