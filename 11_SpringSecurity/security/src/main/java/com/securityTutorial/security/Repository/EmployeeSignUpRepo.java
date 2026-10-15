package com.securityTutorial.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.securityTutorial.security.entity.EmployeeSignUp;

@Repository
public interface EmployeeSignUpRepo extends JpaRepository<EmployeeSignUp, Integer> {
	EmployeeSignUp findByUserName(String userName);
}
