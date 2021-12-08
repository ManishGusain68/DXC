package com.synchro;

public class MainClass {
	
	public static void main(String args[]) throws InterruptedException{
		
		MatchUtils m=new MatchUtils();
		
		Thread1 t1=new Thread1(m);
		Thread2 t2=new Thread2(m);
		t1.setName("Thread one");
		t2.setName("Thread two");
		//testing   
		
		
		t1.start();
		t1.join();
		t2.start();
		
	}

}
