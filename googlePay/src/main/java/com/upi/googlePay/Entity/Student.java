package com.upi.googlePay.Entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;

@Entity
public class Student {
	@Id
	private int id;
	@Length(min = 2, max=30, message = "name chukla reee")
	private String firstname;
	private String lastname;
	@Email(message = "enter a valid email")
	private String email;
	@ManyToOne
	@JoinColumn(name = "tid")
	private Teachers teacher;
	public Student()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Teachers getTeacher() {
		return teacher;
	}
	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}
	
}
