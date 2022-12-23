package com.user.AuthService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Author;


@Service
public class AuthorService implements IAuthorService {

	@Autowired
	IAuthorRepo authorRepo;
	
	
	@Override
	public Integer SaveAuthor(Author auth) {
		
	  Author saveAuthor=authorRepo.save(auth);
	  
	  return saveAuthor.getAuth_id();
	}


//	@Override
//	public Author loaduserByUserName(String username) {
//		
//		 Author auth=authorRepo.findByUserName(username)(username);
//		 String pwd=auth.getPwd();
//		 System.out.println(pwd+" password");
//		 
//		 if(auth.getUsername().equals(username))
//		 {
//			 System.out.println(username);
//			 System.out.println(auth.getUsername());
//			 System.out.println(auth.getUsername().equals(username));
//			 
//		 }
//		 
//		 
//	return auth;
//	}


	@Override
	public List<Author> getAllauthors() {
		
		return authorRepo.findAll();
	}


	@Override
	public String validateUser(String username, String password) {
	    String dbpwd= authorRepo.filterByPassword(username);
	    
	    if(dbpwd != null) {
	    	if(dbpwd.equals(password))
	    		return "success";
	    	else
	    		return "failure";
	    }
	    else
	    {
	    	return "false";
	    }
		
	}
	
	
	
	
	
}





