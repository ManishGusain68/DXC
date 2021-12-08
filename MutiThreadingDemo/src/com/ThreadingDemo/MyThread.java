package com.ThreadingDemo;

public class MyThread extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.println("My Thread"+Thread.currentThread().getName());
			
		}
		
	}

}
