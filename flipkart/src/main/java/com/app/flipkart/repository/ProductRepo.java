package com.app.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.flipkart.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
