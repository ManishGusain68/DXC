package com.excepDemo;

public class MainClass {

	static void validate(int age) throws CustomExcDemo {
		if (age < 20) {
			CustomExcDemo c=new CustomExcDemo("age is invalid");
			throw c;
		}
	}

	public static void main(String[] args) {
		int age = 18;
		try {
			validate(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
