package com.sachin.springdemo.rest;

public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException() {
		
	}
	
	public CustomerNotFoundException(String message) {
		super(message);
	}

}
