package com.autowiringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowiringXML/Config.xml");
		Student std=(Student)context.getBean("std1");
		
		System.out.println(std);
	}

}
