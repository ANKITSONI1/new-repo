package com.c2t.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class MainProgram {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/c2t/di/spring-di-3x.xml");
		Employee emp1 = (Employee)context.getBean("bean1");
		System.out.println(emp1.getName());
	}
}
