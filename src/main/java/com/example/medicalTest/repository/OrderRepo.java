package com.example.medicalTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalTest.entity.Order;
@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{
	
	
}
