package com.Security.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Security.model.User;
import com.Security.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@GetMapping("/alluser")
	public List<User> getAlluser(){
		return userService.getalluser();
	}
	
	@GetMapping("/{username}")
	public User GetUserByUserName(@PathVariable String username) {
		
		return userService.GetUserByUserName(username);
		
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.AddUser(user);
	}
	
	
	

}
