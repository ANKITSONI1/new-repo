package com.c2t.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApple {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/factory/Spring-Apple.xml");
		Apple a = (Apple) context.getBean("apple");
		a.msg();
	}
}