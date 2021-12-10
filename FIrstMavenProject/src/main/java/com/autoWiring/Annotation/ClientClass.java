package com.autoWiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autoWiring/Annotation/Config.xml");
		Student std=context.getBean("stud1",Student.class);
		
		System.out.println(std);
		
		System.out.println(std.getPhone());
	
	}

}
