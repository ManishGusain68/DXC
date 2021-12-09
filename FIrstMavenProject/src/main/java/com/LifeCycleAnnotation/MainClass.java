package com.LifeCycleAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/LifeCycleAnnotation/Config.xml");
		Student std = (Student) context.getBean("std1");
		context.registerShutdownHook();

	}

}
