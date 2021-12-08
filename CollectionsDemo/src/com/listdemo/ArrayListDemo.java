package com.listdemo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String args[]) {
		

		List<Integer> list1 = new ArrayList<>();
		list1.add(23);
		list1.add(56);
		list1.add(16);
		list1.add(21);
		
		System.out.println(list1);
		
		list1.remove(2);
		
		System.out.println(list1);

	}

}
