package com.user.AuthService;

import java.util.List;

import com.user.entity.Author;

public interface IAuthorService {
	
	public Integer SaveAuthor(Author auth);
	
//	public Author loaduserByUserName(String username);
	
	public List<Author> getAllauthors();
	
	public String validateUser(String username, String password);
	
	

}
