package com.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer auth_id;
	private String  username;
	private String  pwd;
	private String  email;
	
	public Integer getAuth_id() {
		return auth_id;
	}
	public void setAuth_id(Integer auth_id) {
		this.auth_id = auth_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Author(Integer auth_id, String username, String pwd, String email) {
		super();
		this.auth_id = auth_id;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
	}
	public Author() {
		super();
	}
	
	
	 
	
	
	
	

}
