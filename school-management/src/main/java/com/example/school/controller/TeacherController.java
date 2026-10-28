package com.example.school.controller;

import com.example.school.entity.Teacher;
import com.example.school.service.TeacherService;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }
    
    @PostMapping("/add/{schoolId}")
    public String addTeacher(@RequestBody Teacher teacher,@PathVariable long schoolId) throws Exception {
    	
    	return service.addTeacher(schoolId, teacher);
    	
    }
    @GetMapping("/get-all/{schoolId}")
    public List<Teacher> getAllteacher(@PathVariable long schooldId) throws Exception
    {
    	return	service.getAllTeacher(schooldId);
    }
    
    @GetMapping("/get-by-id/{id}")
    public Teacher deleteById(@PathVariable long teacherId) throws Exception
    {
    		return	service.getTeacherById(teacherId);
   
    }

}
