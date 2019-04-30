package com.c2t.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/el/Spring-el.xml");

		Customer obj = (Customer) context.getBean("customerBean");
		System.out.println(obj);
	}
}
