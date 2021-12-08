package com.studentdemo;



public class Student {

	int rollNumber; // Properties
	String name;
	int marks;

	  Student(int number, String name, int marks) // constructor

	{
		rollNumber = number;
		this.name = name;
		this.marks = marks;

	}

	  int addmarks() {
		return marks + 20;
	}
	



}
