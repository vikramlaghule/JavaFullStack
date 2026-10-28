package app.schoolApp.controller;

import app.schoolApp.dtos.Dtos.studentDto;

import app.schoolApp.dtos.Dtos.studentRequest;
import app.schoolApp.dtos.Dtos.studentResponse;
import app.schoolApp.entity.Student;
import app.schoolApp.service.MapperService;
import app.schoolApp.service.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private  StudentService service;
    private MapperService mapperService;

    public StudentController(StudentService service,  MapperService mapperService) {
        this.service = service;
        this.mapperService=mapperService;
    }
    @PostMapping("/add/{teacherId}")
    public studentDto add(@RequestBody studentRequest student, @PathVariable long teacherId ) throws Exception
    {
    	
    		Student stud=service.add(mapperService.toDto(student), teacherId);
    		return	mapperService.toDto(stud);
    		
    }
    @GetMapping("/getAll")
    public List<studentResponse> getAll()
    {
    
    	return service.getAll().stream().
    		map(s->(mapperService.todto(s))
    			).toList();
    	
    }
    
   
}
