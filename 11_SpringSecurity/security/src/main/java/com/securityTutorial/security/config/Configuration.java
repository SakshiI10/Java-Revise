
package com.securityTutorial.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@org.springframework.context.annotation.Configuration
@EnableWebSecurity
public class Configuration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

//    	http
//    		.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
    	
//    	http
//    		.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
//    		.httpBasic(Customizer.withDefaults())
//    		.formLogin(Customizer.withDefaults());    	
    	
    	http
        	.authorizeHttpRequests(auth -> auth
            .requestMatchers("/home").permitAll()
            .anyRequest().authenticated())
        	.formLogin(Customizer.withDefaults());
    	
    	return http.build();
    }
    
//  When you define this bean, Spring Boot uses your custom user configuration instead of creating its default user from application.properties.
    @Bean
    public UserDetailsService userDetailsService() {
    	UserDetails user1=User 
    			.withUsername("user1")
    			.password("{noop}12345")
    			.roles("USER")
    			.build();

    	UserDetails user2=User 
    			.withUsername("user2")
    			.password("{noop}123456")
    			.roles("USER")
    			.build();
    	
    	return new InMemoryUserDetailsManager(user1, user2);
    }

}
