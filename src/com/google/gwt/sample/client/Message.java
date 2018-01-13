package com.google.gwt.sample.client;

import java.io.Serializable;

public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public Message() {
		
	}
	
	public String getMessage() {
		return message;
	}
	
	
	public void setMessage(String message) {
		this.message = message; 
	}
	
}
