package com.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//		Student std1 = (Student) context.getBean("student1");
//		System.out.println(std1);
//		std1.sayHello();
//		std1.getAddr().sayHi();
		
		//construtor injection
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ConsConfig.xml");
		Student std=(Student)context.getBean("std1");
		System.out.println(std);
		
		
	

	}
}
