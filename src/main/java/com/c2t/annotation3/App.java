package com.c2t.annotation3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"com/c2t/annotation3/SpringBeans.xml"});

    	Student s1 = (Student)context.getBean("s1");
    	System.out.println(s1.getName());
    	
    	Student s2 = (Student)context.getBean("s2");
    	System.out.println(s2.getName());
    }
}
