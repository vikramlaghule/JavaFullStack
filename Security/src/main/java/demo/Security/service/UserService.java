package demo.Security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.Security.entity.User;
import demo.Security.repository.UserRepo;

@Service
public class UserService {

	
	private UserRepo repo;
	
	public UserService(UserRepo repo)
	{
		this.repo=repo;
	}
	
	
	//1. add user service 
	public String addUser(User user)
	{
		repo.save(user);
		return user.getUsername()+" saved successfully.......";
	}
	
	//2. get all user service
	
	public List<User> getAllUsers()
	{
		
		return repo.findAll();
	}
	
	//3. find by id
	public User getById(int id)
	{
		return repo.findById(id).get();
	}
	
	//3. Find by id
	public String deleteById(int id)
	{
		repo.deleteById(id);
		
		return "user with id: "+id+" deleted successfully";	
	}
	
	
	
}
