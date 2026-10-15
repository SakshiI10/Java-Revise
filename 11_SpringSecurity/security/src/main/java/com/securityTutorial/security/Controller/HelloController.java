package com.securityTutorial.security.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securityTutorial.security.employee.Employee;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String index() {
	    return "Welcome to Spring Security!";
	}
	
	@GetMapping("/home")
	public String hello() {
		return "Learning Spring security";
	}

//	Getting session ID
	@GetMapping("/id")
	public String session(HttpServletRequest req) {
		return "Session ID " + req.getSession().getId();
	}
	
//	Getting CSRF Token
	@GetMapping("/csrf")
	public CsrfToken session2(HttpServletRequest req) {
		return (CsrfToken) req.getAttribute("_csrf");
	}
	
	private List<Employee> list = new ArrayList<>(
	        List.of(new Employee(101, "Sakshi", 24))
	);
	
	@GetMapping("/emp")
	public List<Employee> getEmployee(){
		return list;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Employee employee) {
		list.add(employee);
	}
}
