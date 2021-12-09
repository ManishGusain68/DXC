package com.LifeCycle.Inter;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {

	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("cons called");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");
	}

	public void destroy() throws Exception {
		System.out.println("destroy method");
	}

}
