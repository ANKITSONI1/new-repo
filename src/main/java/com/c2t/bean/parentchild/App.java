package com.c2t.bean.parentchild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/bean/parentchild/Spring-autowire-parentchild.xml");
		Parent p = (Parent)context.getBean("id2");
		System.out.println(p.getFname());
	}
}