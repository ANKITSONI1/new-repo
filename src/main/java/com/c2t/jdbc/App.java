package com.c2t.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/c2t/jdbc/applicationContext.xml");
		

		JDBCEmployeeDAO jdbcEmployeeDAO = (JDBCEmployeeDAO) context.getBean("emp");
		
		Employee employee3 = new Employee(456, "javacodegeeks", 34);
		
		jdbcEmployeeDAO.insert(employee3);

		
		context.close();
	}
}
