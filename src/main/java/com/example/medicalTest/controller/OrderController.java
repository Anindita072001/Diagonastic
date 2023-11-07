package com.example.medicalTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.medicalTest.entity.Order;

import com.example.medicalTest.service.OrderService;

import jakarta.validation.Valid;


@Controller
//@RestController
public class OrderController {
	@Autowired
OrderService os;

@PostMapping("/addOrder")
public String addOrder(@Valid Order order,Model model) {

//	 try {
//		
//		 os.addOrder(order);
//		 int pid = order.getPa().getPatient_id();
//		model.addAttribute("sucessBooking", true);
//		model.addAttribute("pid", pid);
//		 return "testbook";
//       } catch (Exception e) {
//    	   System.out.println("error" +e);
//           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    	   return "testbook";
//           
//       }
	
	os.addOrder(order);
	model.addAttribute("successBooking",true);
	return "index";
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
