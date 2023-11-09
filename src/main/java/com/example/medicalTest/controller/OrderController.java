package com.example.medicalTest.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.medicalTest.entity.Order;

import com.example.medicalTest.service.OrderService;
import java.util.Base64;

@Controller
//@RestController
public class OrderController {
	@Autowired
OrderService os;

@PostMapping("/addOrder")
public String addOrder(@ModelAttribute Order order,
						@RequestParam("test_name") String test_name,
						@RequestParam("order_date") Date order_date,
						@RequestParam("imageFile") MultipartFile imageFile,
						Model model) {


	try {
		order.setTest_name(test_name);
		order.setOrder_date(order_date);
		order.setImage(imageFile.getBytes());
	}catch( Exception e) {
	
	}
	
	
	os.addOrder(order);
	model.addAttribute("successBooking",true);
	String base64ImageData = Base64.getEncoder().encodeToString(order.getImage());
	model.addAttribute("imageid", base64ImageData);
	return "index";
//	return "redirect:/testbook" + order.getOrder_id();
}


 @GetMapping("/getOrder")
    public List<Order> getAllOrder() {
	 	return os.fetchAllOrder();
       
    }
  
  @GetMapping("/getOrder/{id}") //localhost:8080/getPatient/5
  public Order getOrderById(@PathVariable("id")int id)
  {
	  return os.getOrderById(id);
	  
  }
  
  @PutMapping("/Order/{id}")
    public Order updateOrder(@PathVariable("id") int id, @RequestBody Order order) {
	  return os.upadteOrderById(id, order);
        
    }
  
  @DeleteMapping("/Order/{id}")
  public String deleteOrder(@PathVariable("id") int id) {
	  return os.deleteOrderById(id);
	  
  }
}
