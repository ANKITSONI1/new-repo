package com.c2t.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/autowire/byname/Spring-autowire-by-name.xml");

		Customer cust = (Customer) context.getBean("customer");
		Address add = cust.getAddress();
		
		System.out.println(add);
	}
}