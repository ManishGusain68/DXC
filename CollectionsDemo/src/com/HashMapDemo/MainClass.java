package com.HashMapDemo;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(112, "Manish");
		Employee e2 = new Employee(113, "Sanjeeta");
		Employee e3 = new Employee(119, "Louis");

		// Map<Employee, Integer> hmap = new HashMap<>();
		//
		// hmap.put(e1, 35);
		// hmap.put(e2, 89);
		// hmap.put(e3, 90);
		//
		// System.out.println(hmap);

//		Map<Employee, Integer> lhmap = new LinkedHashMap<>();
//
//		lhmap.put(e1, 35);
//		lhmap.put(e2, 89);
//		lhmap.put(e3, 90);
//		lhmap.put(null, 900);
//
//		System.out.println(lhmap);
		
		
		Map<Employee, Integer>  htable=new Hashtable<>();
//		htable.put(e1, 35);
//		htable.put(e2, 89);
//		htable.put(e3, 90);
//		
//		
//		System.out.println(htable);
		
		
		Map<String,Integer> treeMap=new TreeMap<>();
		
		treeMap.put("Manish", 35);
		treeMap.put("Sanjeeta", 89);
		treeMap.put("Louis", 90);
		
		
		System.out.println(treeMap);
		
		

	}

}
