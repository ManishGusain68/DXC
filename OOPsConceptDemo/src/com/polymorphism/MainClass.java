package com.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		//NRIStudent std=new NRIStudent(114, "Samar", 89);   //Static Binding
		Student std1=new NRIStudent(112, "Shweta", 90);   //Dynamic Binding or Late Binding
		
	
		System.out.println(std1.addMarks());
		//System.out.println(std.addMarks());
		
	}

}
