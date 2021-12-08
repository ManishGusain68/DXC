package com.polymorphism;

public class NRIStudent extends Student{

	public NRIStudent(int id, String name, int marks) {
		super(id, name, marks);
	}
	
	public  int addMarks(){
		System.out.println("Add marks method of NRI student");
		return marks+40;
	}
	
	

}
