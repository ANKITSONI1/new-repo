package com.c2t.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/autowire/bytype/Spring-autowire-by-type.xml");

		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
}