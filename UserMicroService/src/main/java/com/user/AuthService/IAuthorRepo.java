package com.user.AuthService;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.user.entity.Author;

@Repository
public interface IAuthorRepo extends JpaRepository<Author, Integer>{
	
	@Query("select u.pwd from Author u where u.username=?1")
	public String filterByPassword(String username);
	
	
	@Query("select u from Autor u where u.username=?1 ")
	public Optional<Author> findByName(String authorName);
	
	@Query(value="select * from author.author.detail where useername=:username",nativeQuery = true)
	 public Author findByUserName(String username);
	
	
	

}
