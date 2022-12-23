package com.author.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.author.Service.AuthorService;

import com.author.model.AuthorData;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins="http://localhost:4200/")
public class AuthorController {
	
	@Autowired 
	AuthorService authService;
	
	
	@PostMapping("/signup")
	Integer saveAuthor(@RequestBody AuthorData auth) {
		
		Integer id=authService.SaveAuthor(auth);
		return id;
		
	}
	

}
