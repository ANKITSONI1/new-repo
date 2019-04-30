package com.c2t.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/c2t/scope/Spring-Scope.xml");
		
		/*HelloWorld t = (HelloWorld) context.getBean("id");
		System.out.println(t.getName());
		
		System.out.println("t="+t);
		
		HelloWorld t2 = (HelloWorld) context.getBean("id");
		System.out.println(t2.getName());
		
		System.out.println("t2="+t2);*/
	
		HelloWorld t_p1 = (HelloWorld) context.getBean("id");
		System.out.println(t_p1);
		
		HelloWorld t_p2 = (HelloWorld) context.getBean("id");
		System.out.println(t_p2);
		
		
	}
}
