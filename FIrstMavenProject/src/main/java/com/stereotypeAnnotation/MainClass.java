package com.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotypeAnnotation/Config.xml");
		Student std1=(Student)context.getBean("obj");
		Student std2=(Student)context.getBean("obj");
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		
		
		
		System.out.println(std1.getPhoneNumber());
	
	}

}
