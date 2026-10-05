package com.upi.googlePay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.upi.googlePay.Entity.Teachers;

@Repository
public interface TeachRepo extends JpaRepository<Teachers,Integer> {
	

}
