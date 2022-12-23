package com.author.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AuthorData {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer aid;
	private String username;
	private String  password;
	private String  email;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AuthorData(Integer aid, String username, String password, String email) {
		super();
		this.aid = aid;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public AuthorData() {
		super();
	}
	
	
	 
	
	
	

}
