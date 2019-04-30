package com.c2t.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/annotation/SpringBeans.xml");

		Customer cust = (Customer) context.getBean("customer");
		
		System.out.println(cust.getPerson().getName());
	}
}