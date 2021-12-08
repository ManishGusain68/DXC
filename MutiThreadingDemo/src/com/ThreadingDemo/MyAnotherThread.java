package com.ThreadingDemo;

public class MyAnotherThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("MyAnotherThread" + Thread.currentThread().getName());
			
		}
		
	}

}
