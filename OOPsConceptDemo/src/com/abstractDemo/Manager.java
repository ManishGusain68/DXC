package com.abstractDemo;

public  class Manager extends Employee{
	
	int bonus=10000;

	public Manager(int id, String name, int salary) {
		super(id, name, salary);
	}

	@Override
	public int addSalary() {
		// TODO Auto-generated method stub
		return salary+bonus;
	}

	

}
