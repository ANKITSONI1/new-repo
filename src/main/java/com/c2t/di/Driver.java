package com.c2t.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class Driver {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/c2t/di/spring-di-3x_2.xml");
		Car car1 = (Car)context.getBean("car");
		car1.display();
	

	}
}
