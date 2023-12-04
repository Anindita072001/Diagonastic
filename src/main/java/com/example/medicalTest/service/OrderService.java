package com.example.medicalTest.service;

import java.util.List;

import com.example.medicalTest.entity.Order;



public interface OrderService {
	Order addOrder(Order order); // Insert
	List<Order> fetchAllOrder(); // select
	Order getOrderById(int id); // select by id
	Order upadteOrderById(int id, Order order); // Update
	String deleteOrderById(int id);

}
