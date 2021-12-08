package com.garbageDemo;

public class MainClass {

	public static void main(String[] args) {
		Student std1 = new Student(112, "Samar");
		Student std2 = new Student(113, "Sai Priya");
		 std1=null;
		System.gc();
		System.out.println("Garbage Collected");
	}

}
