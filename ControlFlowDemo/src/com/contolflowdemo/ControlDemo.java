package com.contolflowdemo;

public class ControlDemo {

	public static void main(String[] args) {
		
		
		int i=100;
		int j=900;
		
//		if((i>800) | (j>600))
//		{
//			System.out.println("i is 100");
//		}else {
//			System.out.println("i is not 100");
//		}
//		
		String output=((i>800) | (j>600))? "i is 100":"i is not 100";
		System.out.println(output);
		
		
		
		
		boolean z= (i>1000)?true:false;   //ternary operator
		
		int m=(i>500)?20:30;
		
		System.out.println(m);
		

	}

}
