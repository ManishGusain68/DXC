package com.interfaceDemo;

public class Engineer implements SalaryCalaculation,NewCalacu{
	
	int id;
	String name;
	int salary;
	
	
	public Engineer(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int addBonus() {
	
		return salary+bonus;
	}
	
	
}
