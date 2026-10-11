package com.thymeleaf.tutorial.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MyController {

	@GetMapping("/home")
	public String getData() {
		return "home";
	}
	
	@GetMapping("/header")
	public String getPage() {
		return "header";
	}
	
//	Thymeleaf Loop
//	@GetMapping("/home")
//	public String getData(Model model) {
//		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
//		model.addAttribute("listOfNumbers", list);
//		return "home";
//	}
//
//
//	@GetMapping("/home/{userInput}")
//	public String getData(@PathVariable("userInput") int user, Model model) {
//	    List<Integer> table = new ArrayList<>();
//	
//	    for (int i = 1; i <= 10; i++) {
//	        table.add(user * i);
//	    }
//	
//	    model.addAttribute("number", user);
//	    model.addAttribute("table", table);
//	
//	    return "home";
//	}

}
