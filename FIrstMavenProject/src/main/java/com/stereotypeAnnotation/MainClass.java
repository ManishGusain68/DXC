package com.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotypeAnnotation/Config.xml");
		Student std=(Student)context.getBean("student");
		System.out.println(std);
		System.out.println(std.getPhoneNumber());
	
	}

}
