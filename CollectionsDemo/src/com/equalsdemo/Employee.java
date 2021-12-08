package com.equalsdemo;

public class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		return this.id==e.id;
	}
	
	
	
	

}
