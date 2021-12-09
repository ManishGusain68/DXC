package com.LifeCycle.Inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCLass {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/LifeCycle/Inter/Config.xml");
		Employee emp1=(Employee)context.getBean("emp1");
		context.registerShutdownHook();
		
	}

}
