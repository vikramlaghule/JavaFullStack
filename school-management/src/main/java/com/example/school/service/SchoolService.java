package com.example.school.service;

import com.example.school.entity.School;
import com.example.school.repository.SchoolRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    private SchoolRepository schoolRepository;
   
    public SchoolService(SchoolRepository schoolRepository)
    {
        this.schoolRepository = schoolRepository;       
    }

    public String add(School school)
    {
    	
    	schoolRepository.save(school);
    	
    	return school.getName()+" added successfully";
    }
    
    public List<School> getAll()
    {
    	return schoolRepository.findAll();
    }
   
    public School getById(long id) throws Exception
    {
    	return 	 schoolRepository.findById(id).orElseThrow(()->
    		 new Exception("School not found with this id"));
    }
    
    public String deleteByid(long id) throws Exception
    {
    		
    		Optional<School> op=schoolRepository.findById(id);
    		
    		
    		if(op.isEmpty()) {
    		throw new Exception("School not found");
    			
    		}else {
    			schoolRepository.deleteById(id);
    		}
    		
    		return op.get().getName()+"deleted successfully";
    		
    	
    }
    public String updateByID(long id,School school) throws Exception
    {
    	Optional<School> op=schoolRepository.findById(id);
		
		
		if(op.isEmpty()) {
		throw new Exception("School not found");
		}else {
			School sc=op.get();
			
			sc.setName(school.getName());
			sc.setCity(school.getCity());
			sc.setAddress(school.getAddress());
			schoolRepository.save(sc);
			return  sc.getName()+ "this schools details updated successfully";
		}
    		
    		
    		
    }
    
}
