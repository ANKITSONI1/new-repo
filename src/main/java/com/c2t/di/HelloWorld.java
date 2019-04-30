package com.c2t.di;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	private int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	HelloWorld(){
	}
	
	HelloWorld(String value){
		this.name = value;
	}
	
	HelloWorld(String value, Employee e){
		this.name = value;
		System.out.println(e.getName());
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello ! " + name + ", your age is ::"+age);
	}

	public String getName() {
		return name;
	}
	
	
}
