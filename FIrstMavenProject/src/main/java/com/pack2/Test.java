package com.pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("AdditionConfig.xml");
			Addition add=(Addition)context.getBean("add1");
		   add.add();
			
			
	}

}
