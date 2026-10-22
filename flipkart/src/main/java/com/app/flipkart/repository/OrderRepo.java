package com.app.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.flipkart.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
