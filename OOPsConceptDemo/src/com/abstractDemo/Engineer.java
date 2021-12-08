package com.abstractDemo;

public class Engineer extends Employee{
	
	int bonus=20000;

	public Engineer(int id, String name, int salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addSalary() {
		
		return salary+bonus;
	}
	
	

}
