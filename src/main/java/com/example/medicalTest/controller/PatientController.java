package com.example.medicalTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.medicalTest.entity.Patient;
import com.example.medicalTest.service.PatientService;

import jakarta.validation.Valid;
@Controller
//@RestController
//@CrossOrigin
public class PatientController {
	@Autowired
	PatientService ts;
	
	
	
	@PostMapping("/addPatient")
	public ResponseEntity<String> addPatient( @Valid Patient test) {
		
		 try {
			 	ts.addPatient(test);
//	            return new ResponseEntity<>(, HttpStatus.CREATED);
	            return ResponseEntity.status(HttpStatus.FOUND).header("Location", "/login").body("Form submitted successfully");
	        } catch (Exception e) {
	        
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
		
	}
	
	@PostMapping("/login")
    public String loginSubmit(
            @RequestParam String email_id,
            @RequestParam String password,
            RedirectAttributes attributes,
            Model model) {
		Patient user= ts.loginPatient(email_id);

        if (user !=null && user.getPassword().equals(password)) {
        	model.addAttribute("isLogin",true);
        	model.addAttribute("user", user);
            return "testbook";
        } else {

        	
        	model.addAttribute("errorLogin",true);
            model.addAttribute("error", "invalid credential");
            return "login";
        }
    }
	
//	@GetMapping("/testbook")
//    public String userPage(Model model) {
//		boolean check = (boolean) model.getAttribute("successfullLogin");
//		if(check) {
//			model.addAttribute("isLogin",true);
//			return "testbook";
//		}
//		return "login";
//        
//    }
	
	
	
	 @GetMapping("/getPatient")
	    public List<Patient> getAllPatient() {
		 	return ts.fetchAllTest();
	       
	    }
	  
	  @GetMapping("/getPatient/{id}") //localhost:8080/getPatient/5
	  public Patient getPatientById(@PathVariable("id")int id)
	  {
		  return ts.getPatientById(id);
		  
	  }
	  
	  @PutMapping("/patient/{id}")
	    public Patient updatePatient(@PathVariable("id") int id, @RequestBody Patient test) {
		  return ts.upadtePatientById(id, test);
	        
	    }
	  
	  @DeleteMapping("/patient/{id}")
	  public String deletePatient(@PathVariable("id") int id) {
		  return ts.deletePatientById(id);
		  
	  }
}
