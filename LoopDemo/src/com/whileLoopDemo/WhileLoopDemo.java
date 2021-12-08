package com.whileLoopDemo;

public class WhileLoopDemo {

	public static void main(String[] args) {

		
	

	int arr[] = { 1, 3, 5, 3 }; // 1D array

//	for(int i = 0;i<arr.length;i++)
//	{
//			System.out.print(arr[i]+ " ");
//	}
	
	//enhanced for loop
	for(int i:arr){
		System.out.print(i);
	}
	
	String names[]={"shweta","dxc","Shruti"};
	for(String j:names){
		System.out.println(j);
	}

	}
}
