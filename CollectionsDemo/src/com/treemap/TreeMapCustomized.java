package com.treemap;

import java.util.*;

public class TreeMapCustomized {

	public static void main(String[] args) {
		Student std1=new Student(119, "Manish");
		Student std2=new Student(100,"Sanjeeta");
		Student std3=new Student(225,"Louis");
		
		Map<Student,Integer> tmap=new TreeMap<>(new IdComparator());
		
		tmap.put(std1,900);
		tmap.put(std2,901);
		tmap.put(std3, 1000);
		
		System.out.println(tmap);
		
		
		
		
	}

}
