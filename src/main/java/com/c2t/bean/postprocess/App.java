package com.c2t.bean.postprocess;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/bean/postprocess/Spring-post-process.xml");
		Person person = (Person) context.getBean("person");
		
		
	}
}