package com.c2t.di.constructor;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	private Employee e;
	int count;
	
	HelloWorld(String value,int i){
		
		System.out.println("I am in constructor 1..");
		
		name = value;
		count = i;		
	}
		
	HelloWorld(String value,int i, Employee e1){
		
		System.out.println("I am in constructor 2..");
		
		name = value;
		e = e1;
		count = i;		
		System.out.println("I am inside constructor"+e.getEmp());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
	public void initMethod(){
		System.out.println("Init Method!!!");
	}
}
