package com.pack3;

public class ThreadTutoLambda {

	public static void main(String[] args) {
	 
		Runnable thread1= ()-> {
			for(int i=0;i<10;i++){
				System.out.println(i);
				
			}
		};
		
		Thread t=new Thread(thread1);
		
		t.start();

	}

}
