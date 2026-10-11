package com.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.studentmanagement.dto.StudentDto;
import com.studentmanagement.entity.Student;
import com.studentmanagement.exception.StudentNotException;
import com.studentmanagement.repository.StudentRepo;

@Service
public class StudentService {
	
	private StudentRepo repo;

	public StudentService(StudentRepo repo)
	{
		this.repo=repo;
	}
	
	//1.Add student service
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
	
	
	//2.Get all students
	public List<Student> getAllStudent()
	{
		
		return repo.findAll();
	}
	

	// 3.Get by ID
	public StudentDto getById(int id) throws StudentNotException
	{
	    Optional<Student> st = repo.findById(id);

	    boolean flag = st.isEmpty();

	    if (flag) {
	        throw new StudentNotException("Student not found");
	    }
	    else
	    {
	        Student s = st.get();

	        StudentDto dt = new StudentDto();

	        dt.setName(s.getName());
	        dt.setEmail(s.getEmail());
	        dt.setCourse(s.getCourse());
	        dt.setAge(s.getAge());
	        dt.setCity(s.getCity());
	        dt.setPercentage(s.getPercentage());

	        return dt;
	    }
	}
	
	//4. Update Student
	public String updateStudent(int id,Student st) throws StudentNotException
	{
		Optional<Student> student = repo.findById(id);

	    boolean flag = student.isEmpty();
	    
	    Student s=student.get();

	    if (flag) {
	        throw new StudentNotException("Student not found enter a valid id ");
	    }
	    else
	    {
	    	s.setId(st.getId());
			s.setName(st.getName());
			s.setEmail(st.getEmail());
			s.setCourse(st.getCourse());
			s.setAge(st.getAge());
			s.setCity(st.getCity());
			s.setPercentage(st.getPercentage());
	    }
		return "Student updated successfully";
	}
	
	
	
	//5. Delete Student
	public String deleteStudent(int id) throws StudentNotException
	{
	
	 Student student = repo.findById(id)
	                .orElseThrow(() ->
	                new StudentNotException("Student not found with ID: " + id));

	        repo.delete(student);
	        
	        return "Student deleted successfully";
	}
	
	
	
	
	
}
