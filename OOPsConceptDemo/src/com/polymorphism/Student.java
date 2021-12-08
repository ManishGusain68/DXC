package com.polymorphism;

public class Student {

	int id;
	String name;
	static int marks;
	static final int PANCARDNR; //static blank final variable
	static {
		PANCARDNR=1234;
	}
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		//PANCARDNR=pan;
	}

	public  int addMarks() {
		System.out.println("add marks method of Student");
		return marks+20;
	}
}
