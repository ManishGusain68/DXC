package com.wrap;

public class IntDemo {
	
	public static void main(String args[]){
		
		int j=3000;
		Integer i1=Integer.valueOf(j);//boxing
		Integer i=j; //wrapping or autoboxing  int to object
		
		System.out.println(i);
		
		int m=i; //unwrapping or Auto unboxing  object to int
		System.out.println(m);
	}

}
