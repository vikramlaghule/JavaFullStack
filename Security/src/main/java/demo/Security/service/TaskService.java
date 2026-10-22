package demo.Security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.Security.entity.Task;
import demo.Security.entity.User;
import demo.Security.repository.TaskRepo;
import demo.Security.repository.UserRepo;

@Service
public class TaskService {

	private TaskRepo repo;
	private UserRepo user_repo;
	
	public TaskService(TaskRepo repo,UserRepo urepo)
	{
		this.repo=repo;
		this.user_repo=urepo;
	}
	
	//1. add task to that user 
	public String addTask(int id,Task task)
	{
	User user	=user_repo.findById(id).
				orElseThrow(()->
				new RuntimeException("user not found"));
		
	
		task.setUser(user);
		
		repo.save(task);
		
		return "task added successfully";
	}
	
	//2. delete task from that user 
	public String deleteTaskById(int id)
	{
		repo.deleteById(id);
		return "task with this id : "+id+"deleted successfully";
	}
	//3.get all task of that user
	public List<Task> getAllTask(int id)
	{
		User user	=user_repo.findById(id).
				orElseThrow(()->
				new RuntimeException("user not found"));
		
		return user.getTasks();	
	}
	
	
}
