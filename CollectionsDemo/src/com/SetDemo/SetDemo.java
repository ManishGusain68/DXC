package com.SetDemo;

import java.util.*;

public class SetDemo {

	public static void main(String args[]) {
		Set<Integer> tset=new TreeSet<>();
		
		
		tset.add(23);
		tset.add(78);
		tset.add(99);
		tset.add(88);
		
		
		System.out.println(tset);
		
		Employee e1=new Employee(112,"Manish",80000);
		Employee e2=new Employee(114,"Samar",90000);
		Employee e3=new Employee(100,"Sai Priya",89000);
		Employee e4=new Employee(122,"Spandana",180000);
		Employee e5=new Employee(110,"Shweta",809000);
		
		Set<Employee> lhset=new LinkedHashSet<>();
		
		lhset.add(e1);
		lhset.add(e2);
		lhset.add(e3);
		lhset.add(e4);
		lhset.add(e5);
		
		System.out.println(lhset);
		
		
		
		
		
	}

}
