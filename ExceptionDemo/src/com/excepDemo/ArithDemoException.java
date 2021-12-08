package com.excepDemo;

public class ArithDemoException {

	public static void main(String[] args) {

		try {
			int x = 30 / 0;
			System.out.println(x);

		} catch (Exception e) {
			
			System.out.println("Exception occured");
		}
		System.out.println("testing......");

	}

}
