package com.book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID=1L;
	
	 private String resourceName;
	 private String fieldname;
	 private Integer fieldValue;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String getResourceName() {
		return resourceName;
	}
	


	public String getFieldname() {
		return fieldname;
	}
	public Integer getFieldValue() {
		return fieldValue;
	}
	 
	public ResourceNotFoundException(String resourceName, String fieldname, Integer fieldValue) {
		super(String.format("%s is not found %s : %s", resourceName,fieldname,fieldValue));
		this.resourceName = resourceName;
		this.fieldname = fieldname;
		this.fieldValue = fieldValue;
	}
	 
	
	
	

}
