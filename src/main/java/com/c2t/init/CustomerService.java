package com.c2t.init;

public class CustomerService 
{
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initialize(){
		System.out.println("I am in Init....Connecting to database...");
	}
	
	public void destroy(){
		System.out.println("I am in Destroy...Closing database connection...");
	}
}
