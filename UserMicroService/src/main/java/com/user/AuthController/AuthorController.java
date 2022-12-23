package com.user.AuthController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.AuthService.IAuthorService;
import com.user.entity.Author;

@RestController
@RequestMapping("/api/v3/")
@CrossOrigin("http://localhost:4200/")
public class AuthorController {
	
	@Autowired
	IAuthorService iauthService;
	
	@PostMapping("/signup")
	public Integer SaveAuthor(@RequestBody Author auth) {
		
		Author  a1=new Author();
		a1.setUsername(auth.getUsername());
		a1.setPwd(a1.getPwd());
		a1.setEmail(a1.getEmail());
		Integer id=iauthService.SaveAuthor(a1);
		
		return id;
		
	}
	
	

}
