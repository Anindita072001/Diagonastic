package com.example.medicalTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalTest.entity.Feedback;
import com.example.medicalTest.service.FeedbackService;


import jakarta.validation.Valid;

@RestController
public class FeedbackController {
	@Autowired
FeedbackService ts;
	
	@PostMapping("/addTestname")
	public ResponseEntity<String> addTestName(@Valid   Feedback testname, Model model) {
		
	
		 try {
			 ts.addTestName(testname);
			 model.addAttribute("showSuccessPopup", true);
			 return ResponseEntity.status(HttpStatus.FOUND).header("Location", "/feedback").body("sucess");
	        } catch (Exception e) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

	            
	        }
	}


	 @GetMapping("/getTestname")
	    public List<Feedback> getAllTestName() {
		 	return ts.fetchAllTestName();
	       
	    }
	  
	  @GetMapping("/getTestname/{id}") //localhost:8080/getPatient/5
	  public Feedback getTestNameById(@PathVariable("id")int id)
	  {
		  return ts.getTestNameById(id);
		  
	  }
	  
	  @PutMapping("/Testname/{id}")
	    public Feedback updateTestName(@PathVariable("id") int id, @RequestBody Feedback testname) {
		  return ts.upadteTestNameById(id, testname);
	        
	    }
	  
	  @DeleteMapping("/Testname/{id}")
	  public String deleteTestName(@PathVariable("id") int id) {
		  return ts.deleteTestNameById(id);
		  
	  }
}
