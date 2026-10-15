package com.securityTutorial.security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securityTutorial.security.Repository.SignupRepo;
import com.securityTutorial.security.entity.EmployeeSignUp;

@RestController
public class SignupController {

	@Autowired
    private SignupRepo repo;

    @PostMapping("/signup")
    public String signup(@RequestBody EmployeeSignUp employee) {

        repo.save(employee);

        return "Employee Registered!";
    }
}