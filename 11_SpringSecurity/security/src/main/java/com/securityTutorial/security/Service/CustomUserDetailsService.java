package com.securityTutorial.security.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.securityTutorial.security.Repository.EmployeeSignUpRepo;
import com.securityTutorial.security.entity.EmployeeSignUp;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private EmployeeSignUpRepo repo;

	@Override
	public UserDetails loadUserByUsername(String userName)
	        throws UsernameNotFoundException {

	    EmployeeSignUp emp = repo.findByUserName(userName);

	    if (emp == null) {
	        throw new UsernameNotFoundException("User Not Found: " + userName);
	    }

	    System.out.println("Username from DB: " + emp.getUserName());
	    System.out.println("Password from DB: " + emp.getPassword());

	    return new User(
	        emp.getUserName(),
	        emp.getPassword(),
	        List.of(new SimpleGrantedAuthority("ROLE_USER"))
	    );
	}
}