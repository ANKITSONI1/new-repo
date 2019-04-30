package com.c2t.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/di/constructor/Spring-Module.xml");

		HelloWorld obj = (HelloWorld) context.getBean("bean1");
		obj.printHello();
		
		obj.setName("S");
		
		//read the properties file here. and fetch name.
		
		
	}
}
