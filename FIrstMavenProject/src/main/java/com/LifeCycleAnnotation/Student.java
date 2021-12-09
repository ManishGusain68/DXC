package com.LifeCycleAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("COnstruct");
	}
	@PostConstruct
	public void start(){
		System.out.println("init method");
	}
	
	@PreDestroy
	public void stop(){
		System.out.println("destroy method");
	}

}
