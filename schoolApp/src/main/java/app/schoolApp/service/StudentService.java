package app.schoolApp.service;

import app.schoolApp.entity.Student;
import app.schoolApp.entity.Teacher;
import app.schoolApp.repository.SchoolRepository;
import app.schoolApp.repository.StudentRepository;
import app.schoolApp.repository.TeacherRepository;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private  SchoolRepository schoolRepository;
    private  TeacherRepository teacherRepository;
    private  StudentRepository studentRepository;

    public StudentService(SchoolRepository schoolRepository,
                   TeacherRepository teacherRepository,
                   StudentRepository studentRepository) {
        this.schoolRepository = schoolRepository;
        this.teacherRepository = teacherRepository;
        this.studentRepository = studentRepository;
    }

    public Student add(Student student,long teacherId) throws Exception
    {
    	
    Teacher teach=	teacherRepository.findById(teacherId).orElseThrow(()->
    	new Exception("Enter valid teacher id"));
    	
    	student.setTeacher(teach);
    	student.setSchool(teach.getSchool());
  
    	studentRepository.save(student);
      	return student;
    	
    }
    
    public List<Student> getAll()
    {
    	return studentRepository.findAll();
    }
   
        		
    
}
