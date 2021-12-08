package com.pack2;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String args[]){
		
		Employee e1=new Employee(112, "Manish");
		Employee e2=new Employee(100, "Sanjeeta");
		Employee e3=new Employee(122, "Louis");
		Employee e4=new Employee(55,"Samar");
		Employee e5=new Employee(300, "Sai Priya");
		
		List<Employee> elist=new ArrayList<>();
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		
		System.out.println(elist);
		
		List<Employee> sortedList=elist.stream().sorted((i,j)->i.id-j.id).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<Employee> sortedAsName=elist.stream().sorted((i,j)->i.name.compareTo(j.name)).collect(Collectors.toList());
		
		System.out.println(sortedAsName);
	}

}
