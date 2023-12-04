package com.example.medicalTest.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webcontroller {
	
	
		
	
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	
	}
	
	@GetMapping("/signup")
	public String signup() {
		
		return "signup";
	}
	
	@GetMapping("/contact")
	public String contact() {
		
		return "contact";
	}
	
	@GetMapping("/test")
	public String test() {
		
		return "test";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/gallary")
	public String gallary() {
		return "gallary";
		
	}
	
	
	@GetMapping("/about")
	public String about() {
		return "about";
		
	}
	
//	@GetMapping("/profile")
//	public String profile() {
//		return "profile";
//		
//	}
	
	@GetMapping("/feedback")
	public String feedback() {
		return "feedback";
		
	}
	
//	@GetMapping("/testbook")
//	public String testbook() {
//		return "testbook";
//		
//	}
	
	
	@PostMapping("/testbook")
    public String userPage(Model model) {
		boolean check = (boolean) model.getAttribute("successfullLogin");
		boolean check1 = (boolean) model.getAttribute("sucessBooking");
		if(check) {
			model.addAttribute("isLogin",true);
			return "testbook";
		}
		if(check1) {
			model.addAttribute("sucessBooking", true);
			return "testbook";
		}
		
		return "login";
        
    }
	
	
//	@GetMapping("/getOrder")
//	public String testbook() {
//		return "getOrder";
//		
//	}
//	
	
	
	
	
}
