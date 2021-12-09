package com.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/LifeCycle/Config.xml");
			Student student=(Student)context.getBean("std1");
			context.registerShutdownHook();
	
	}

}
