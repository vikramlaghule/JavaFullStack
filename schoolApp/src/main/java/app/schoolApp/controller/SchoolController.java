package app.schoolApp.controller;

import app.schoolApp.dtos.Dtos.schoolName;
import app.schoolApp.entity.School;
import app.schoolApp.service.MapperService;
import app.schoolApp.service.SchoolService;


import java.util.List;
import java.util.stream.Collectors;

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

    private  SchoolService service;
    private MapperService mapperService;
    public SchoolController(SchoolService service, MapperService mapperService) {
        this.service = service;
        this.mapperService=mapperService;
    }
    
    @PostMapping("/add")
    public String addSchool(@RequestBody School school)
    {
    	return service.add(school);
    }
    
    @GetMapping("get")//circular dependency wala api
    public List<School> getAll()
    {
    		return service.getAll();
    }
    
   // @GetMapping("/get-school&teacher")  // After resolving circular dependency using dtos
   
  
    @GetMapping("/get-school&teacher")
    public List<schoolName> getAllST() {

        List<School> list = service.getAll();

        return list.stream().
        		map(s->(mapperService.mapSchool(s))
        				).toList();
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
    
    @DeleteMapping("/delete/{id}")
    public String deleteByid(@PathVariable long id) throws Exception
    {
    		return service.deleteByid(id);
    }
    
    
    @GetMapping("/get-city/{city}")
    public List<School> getall(@PathVariable String city)
    {
    		return service.getByCity(city);
    }
}
