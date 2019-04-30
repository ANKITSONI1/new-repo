package com.c2t.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrinter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/factory/Spring-Printer.xml");
		Dell a = (Dell) context.getBean("printer");
		a.print();
	}
}