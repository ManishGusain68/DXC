package com.listdemo;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> linkedList=new LinkedList<>();
		
		linkedList.add(23);
		linkedList.add(88);
		linkedList.add(11);
		linkedList.add(24);
		
		linkedList.add(1, 55);
		
		System.out.println(linkedList);

	}

}
