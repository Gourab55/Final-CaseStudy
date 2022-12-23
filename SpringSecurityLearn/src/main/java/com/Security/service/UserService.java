package com.Security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Security.model.User;

@Service
public class UserService {
	
	List<User> list=new ArrayList<>();
	
	public UserService() {
		list.add( new User("gourab","gourab@123","gj@gmail.com"));
		list.add( new User("aniket","aniket@123","anket23@gmail.com"));
		
	}
	
	public List<User> getalluser(){
		return this.list;
	}
	
	public User GetUserByUserName(String username) {
		return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
		
	}
	
	public User AddUser(User user) {
		this.list.add(user);
		return user;
	}
	
	
	
	


	
	 

}
