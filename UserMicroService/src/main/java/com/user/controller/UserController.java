package com.user.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.AuthService.IAuthorService;
import com.user.entity.Author;
import com.user.entity.User;
import com.user.service.IUserService;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin("http://localhost:4200/")
public class UserController {
	
	@Autowired
	IUserService iuserService;
	
	@Autowired
	IAuthorService iauthService;
	
	
	@PostMapping("/signup")
       Integer CreateUser(@RequestBody User user) {
		
		Integer id=iuserService.saveUser(user);
		System.out.println(id);
		return id;
		
		
		
		
		
		
	}
	
	//HttpServletResponse response
//	Cookie theCookie= new Cookie("digitalbook.username", user.getUsername());
//	theCookie.setMaxAge(60*60*10);
//	
//	
//	response.addCookie(theCookie);
	
	

}
