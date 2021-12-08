package com.staticDemo;

public class Employee {

	int id;
	String name;
	int salary;
	static int bonus=1000;
	
	//static variable is class variable

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public  void addBonus(){
		System.out.println(bonus);
	}

}
