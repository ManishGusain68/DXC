package com.LifeCycle;

public class Student {

	private int id;
	private String name;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setting the value of id");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setting the value of name");
	}
	
	public void start(){
		System.out.println("init method called");
	}
	
	public void stop(){
		System.out.println("destroy method called");
	}
	
	

}
