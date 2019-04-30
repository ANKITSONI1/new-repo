package com.c2t.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/init/Spring-Init-local.xml");
/*
		CustomerService custA = (CustomerService) context
				.getBean("customerService2");
		System.out.println(custA.getMessage());*/
		
	}
}
