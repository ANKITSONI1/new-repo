package com.c2t.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/autowire/byconstructor/Spring-autowire-by-constructor.xml");

		Developer developer = (Developer) context.getBean("developer");
		System.out.println(developer);
	}
}