package com.author.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.author.model.AuthorData;

@Repository
public interface IAuthorRepo extends JpaRepository<AuthorData, Integer> {
	
	

}
