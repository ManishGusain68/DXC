package com.InheritDemo;

public class MainClass {

	public static void main(String[] args) {
		Animal dog = new Animal(4, "tommy", 112);
		HumanBeing man = new HumanBeing(2, "Manish", 34);
		
		System.out.println(dog.getName());
		
		dog.setName("Louis");
		
		System.out.println(dog.getName());
		
	}

}
