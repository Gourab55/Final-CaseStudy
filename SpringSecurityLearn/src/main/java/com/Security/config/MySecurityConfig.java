package com.Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;




@Configuration
@EnableWebSecurity

public class MySecurityConfig extends WebSecurityConfigurerAdapter   {
	
	
	
@Override
protected void configure(HttpSecurity http) throws Exception {
    
	http
	  
	  .authorizeRequests().antMatchers("/public/**").hasRole("normal")
	  .antMatchers("/users/**").hasRole("admin")
	  .anyRequest()
	  .authenticated()
	  .and()
	  .httpBasic();
	  
     }
  @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("gourab").password("gjati@123").roles("normal");
		auth.inMemoryAuthentication().withUser("stithi").password("st@123").roles("admin");
		
	}


  @Bean
  public PasswordEncoder  passwordEncoder() {
	  return NoOpPasswordEncoder.getInstance();
  }










}
