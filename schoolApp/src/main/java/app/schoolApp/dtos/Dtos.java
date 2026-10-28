package app.schoolApp.dtos;

import java.util.List;

import app.schoolApp.entity.Student;

public class Dtos {
	
	public record studentRequest(String name,Integer rollNo,String className) {}
	public record studentResponse(String name,Integer rollNo,String className,String teacherName) {}
	
	public record studentDto(String name,Integer rollNo,String className,String teacherName,String schoolName) {}
	
	public record teacherDto(String teacherName, String teacherEmail,String teacherSubject,String schoolName,
			List<Student> ls){}
	
	
	//Resolving school circular dependency
	public record schoolName(String shoolName,List<teacherName> list) {}
	public record teacherName(String teacherName,List<studentName>list) {}
	public record studentName(String studentName) {}
	
	
	
	
	
	
	public record scholTeacherDto(String schoolName,String teacherName) {}
	
	public record schoolStudentDto(String schoolName,String studentName) {}
	
	public record teacherStudentDto(String teacherName,List<Student> list) {}
	

}
