package demo.Security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.Security.entity.User;
import demo.Security.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService service;
	
	public UserController(UserService service)
	{
		
		this.service=service;
	}
	
	// 1. controller to add user
	@PostMapping("/add")
	public String addUser(@RequestBody User user)
	{
		return service.addUser(user);
	}
	
	//2. to get by id controller
	@GetMapping("/find/{id}")
	public User getuserById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	//3.controller to get all users
	@GetMapping("/getAll")
	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	//4. controller delete user by id
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		return service.deleteById(id);
	}
	
	
	
}
