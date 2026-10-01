package com.vikram.RegisterLogin.Services;


import org.springframework.stereotype.Service;

import com.vikram.RegisterLogin.Entity.Users;
import com.vikram.RegisterLogin.Repositories.UserRepo;

@Service
public class UserService {
	
	private UserRepo users;
	public UserService(UserRepo users)
	{
		this.users=users;
	}
	public String registerUser(Users user ) {
		
		users.save(user);
		
		return "user added successfully";
	}
}
