package com.c2t.bean.postprocess;
 
public class Person 
{
	
	String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Person(){
		
	}
	
	void display(){
		System.out.println("I am person!!!");
	}
	
	public void initMethod(){
		System.out.println("init");
	}
	
	public void destroyMethod(){
		System.out.println("destroy");
	}
	
	public void readFile(){
		
	}
}