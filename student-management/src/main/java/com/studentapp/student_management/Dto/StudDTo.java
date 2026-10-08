package com.studentapp.student_management.Dto;

import java.util.List;



public class StudDTo {

	
	String teachername;
	List<Stud> student;
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public List<Stud> getStudent() {
		return student;
	}
	public void setStudent(List<Stud> student) {
		this.student = student;
	}
	
}
