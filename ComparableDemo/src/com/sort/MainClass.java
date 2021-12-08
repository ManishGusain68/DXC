package com.sort;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Integer i = 100;
		Integer j = 99;

		System.out.println(i.compareTo(j));

		String str1 = "Szmar";
		String str2 = "Spandana";

		System.out.println(str1.compareTo(str2));

		Student s1 = new Student(112, "Manish");
		Student s2 = new Student(76, "Spandana");
		Student s3 = new Student(118, "Sai Priya");

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		System.out.println(list);

		IdComparator idcomp = new IdComparator();

		Collections.sort(list, idcomp);

		System.out.println(list);

		Collections.sort(list, new NameComparator());

		System.out.println(list);

		List<Integer> newList = new ArrayList<>();

		newList.add(12);
		newList.add(1);
		newList.add(90);
		newList.add(18);
		newList.add(6);
		newList.add(100);

		Collections.sort(newList);

	}

}
