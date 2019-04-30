package com.c2t.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/c2t/aop1/spring-aop.xml");

		CustomerBo customer = (CustomerBo) context.getBean("customer");
		customer.addCustomer("Naresh Chaurasia");
		

	}
}
