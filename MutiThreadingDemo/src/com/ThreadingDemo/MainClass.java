package com.ThreadingDemo;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread();
		MyAnotherThread thread2 = new MyAnotherThread();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println(Thread.currentThread().getName());
		int nr = scan.nextInt();
		System.out.println("entered number is : " + nr);

		thread1.setName("thread1");
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
		
		System.gc();

	}

}
