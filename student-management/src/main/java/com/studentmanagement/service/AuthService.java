package com.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.studentmanagement.entity.User;
import com.studentmanagement.repository.UserRepo;

@Service
public class AuthService {
	
	private UserRepo repo;
	private PasswordEncoder passwordEncoder;
	
	public AuthService( UserRepo repo,PasswordEncoder password)
	{
		this.repo=repo;
		this.passwordEncoder=password;
	}
	
	public User registerUser(String Username,String password) throws Exception
	{
		Optional<User> user=repo.findByUsername(Username);
		
		
		if(user.isEmpty())
		{
			User newUser=new User();
			newUser.setUsername(Username);
			newUser.setPassword(passwordEncoder.encode(password));
			newUser.setRole(List.of("USER"));
		return repo.save(newUser);
		}else
		{
			throw new Exception("User already exist");
		}
		
	}
	
}
