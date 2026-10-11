package com.thymeleaf.tutorial.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/show")
	public String show(Model model) {
//		Introduction
//		String channel="Thymeleaf learning";
		
//		Conditional statement
		String channel="Admin";
		model.addAttribute("name",channel);				
		return "show";
	}
}
