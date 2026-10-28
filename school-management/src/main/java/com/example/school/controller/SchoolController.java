package com.example.school.controller;

import com.example.school.entity.School;
import com.example.school.service.SchoolService;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    private final SchoolService service;

    public SchoolController(SchoolService service) {
        this.service = service;
    }
    
    @PostMapping("/add")
    public String addSchool(@RequestBody School school)
    {
    	return service.add(school);
    }
    
    @GetMapping("get")
    public List<School> getAll()
    {
    		return service.getAll();
    }
    
    @GetMapping("/get-by-Id/{id}")
    public School getById(@PathVariable long id) throws Exception
    {
    		return service.getById(id);
    }
    
    @PutMapping("/update/{id}")
    public String updateSchool(@RequestBody School school, @PathVariable long id) throws Exception
    {
    		return service.updateByID(id, school);
    }
    
    @DeleteMapping("/delete/{}")
    public String deleteByid(@PathVariable long id) throws Exception
    {
    		return service.deleteByid(id);
    }
}
