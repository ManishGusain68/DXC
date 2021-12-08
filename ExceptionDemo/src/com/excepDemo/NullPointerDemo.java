package com.excepDemo;

public class NullPointerDemo {

	public static void main(String args[]) {
		String str = null;
		try {
			System.out.println(str.charAt(2));
		} catch (Exception e) {
			System.out.println("Null pointer exception occured");
		}
		
		System.out.println("hi");
	}
}
