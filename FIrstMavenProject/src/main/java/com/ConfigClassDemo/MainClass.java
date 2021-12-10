package com.ConfigClassDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Teacher t1 = context.getBean("getTeacher", Teacher.class);
		t1.setId(100);
		t1.setName("Samar");
		
		
		System.out.println(t1);
		t1.training();

	}

}
