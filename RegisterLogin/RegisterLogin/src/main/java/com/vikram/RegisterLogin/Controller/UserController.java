package com.vikram.RegisterLogin.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.RegisterLogin.Entity.Users;
import com.vikram.RegisterLogin.Services.UserService;


@RestController
public class UserController {

	private UserService service;
	
	public UserController(UserService service)
	{
		this.service=service;
	}
	
	@PostMapping("/register")
	public String register(@RequestBody Users user)
	{
		return service.registerUser(user);
	}
}
