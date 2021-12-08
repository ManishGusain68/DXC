package com.equalsdemo;

public class MainClass {

	public static void main(String[] args) {
		
		Employee e1=new Employee(112, "Manish");
		Employee e2=new Employee(114, "Sanjeeta");
		Employee e3=new Employee(119, "Louis");
		
		System.out.println(e1.equals(e3));
		
		System.out.println(e3.hashCode());
		
		

	}

}
