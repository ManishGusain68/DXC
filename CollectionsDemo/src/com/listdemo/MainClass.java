package com.listdemo;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Student std1=new Student(112, "Sai Priya");
		Student std2=new Student(117,"Manish");
		
		List<Student> list=new LinkedList<>();
		
		list.add(std1);
		list.add(std2);
		
		System.out.println(list);
		
	}

}
