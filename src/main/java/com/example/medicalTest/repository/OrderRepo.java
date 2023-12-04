package com.example.medicalTest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.medicalTest.entity.Order;
import com.example.medicalTest.entity.Patient;
@Repository

public interface OrderRepo extends JpaRepository<Order, Integer>{
	
}
