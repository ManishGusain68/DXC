package com.excepDemo;

public class IndexOutOfBoundExcepDemo {

	public static void main(String args[]) {
		String str="Sai Priya";
		try{
		System.out.println(str.charAt(1));
		System.exit(0);
		}catch(Exception e){
			System.out.println("handled");
		}finally{
			System.out.println("finally block");
		}
	}

}
