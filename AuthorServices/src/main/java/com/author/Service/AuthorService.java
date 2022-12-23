package com.author.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.model.AuthorData;



@Service
public class AuthorService {

	@Autowired IAuthorRepo iauthrepo;
	
	public Integer SaveAuthor(AuthorData auth) {
		
		AuthorData Saveauth=iauthrepo.save(auth);
		 Integer id=Saveauth.getAid();
		 
		  return id;
		
		
	}
	
	
}
