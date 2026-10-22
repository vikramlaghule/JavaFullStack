package com.app.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.flipkart.entity.Customers;

@Repository
public interface CustomerRepo extends JpaRepository<Customers, Integer> 
{

}
