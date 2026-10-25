package com.securityTutorial.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.securityTutorial.security.Service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

//      http
//          .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());

      http
          .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
          .httpBasic(Customizer.withDefaults())
          .formLogin(Customizer.withDefaults());

//        http
//            .authenticationProvider(daoAuthenticationProvider())
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/", "/home", "/signup").permitAll()
//                .anyRequest().authenticated())
//            .formLogin(Customizer.withDefaults());
      
//      Never do this
//            .csrf(csrf -> csrf.disable());

        return http.build();
    }

//  When you define this bean, Spring Boot uses your custom user configuration
//  instead of creating its default user from application.properties.

//  @Bean
//  public UserDetailsService userDetailsService() {
//      UserDetails user1 = User
//          .withUsername("user1")
//          .password("{noop}12345")
//          .roles("USER")
//          .build();
//
//      UserDetails user2 = User
//          .withUsername("user2")
//          .password("{noop}123456")
//          .roles("USER")
//          .build();
//
//      return new InMemoryUserDetailsManager(user1, user2);
//  }

//    Why is above code commented out? Because I want to retrieve registered users from MySQL instead.
    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {

        DaoAuthenticationProvider authProvider =
                new DaoAuthenticationProvider(userDetailsService());

//        It compares passwords as plain text. For example, if the database contains maker123, the submitted password must match maker123.
        
//        This is only for learning; for a real application, use a password-hashing encoder such as BCryptPasswordEncoder.
//        authProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        
        authProvider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return authProvider;
    }
}