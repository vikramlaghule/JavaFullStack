package demo.Security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.Security.entity.Task;
import demo.Security.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	private TaskService service;
	public TaskController(TaskService service)
	{
		this.service=service;
	}
	
	//1. add task
	@PostMapping("/add/{id}")
	public String addtask(@RequestBody Task task,
						 @PathVariable int id)
	{
		return service.addTask(id, task);
	}
	//2. delete task
	//3. get all task
	@GetMapping("/getAll/{id}")
	public List<Task> getAllTask(@PathVariable int id)
	{
		return null;
	}
	
}
