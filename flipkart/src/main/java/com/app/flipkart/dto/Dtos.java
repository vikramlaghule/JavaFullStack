package com.app.flipkart.dto;

public class Dtos {

	
	public record CustomerDto(int custid, String name, String mobno, String mail){ }
	
	
	public record LoginRequest(String username,String password) {}
	 
	
	public record custDto(String name,String mobno,String mail) {}
	
}
