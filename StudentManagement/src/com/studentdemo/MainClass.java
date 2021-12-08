package com.studentdemo;

public class MainClass {

	public static void main(String[] aa)

	{
		Student manish = new Student(12, "Manish", 90);
		Student shweta = new Student(18, "Shweta", 80);

		System.out.println(manish);

		System.out.println(shweta.addmarks());

	}
}
