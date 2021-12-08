package com.pack1;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		Addition m=(a,b)->(a*b);
		
		System.out.println(m.add(8,9));
		
		List<Integer> list=new ArrayList<>();
		
		list.add(89);
		list.add(12);
		list.add(56);
		list.add(3);
		
		System.out.println(list);
		
		List<Integer> evenList=list.stream().filter((i)-> i%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<Integer> squaredList=list.stream().map((e) -> e*2).collect(Collectors.toList());
		System.out.println(squaredList);
		
		int minimum=list.stream().min((i,j) -> i-j).get();
		
		System.out.println(minimum);
		
		int maximum=list.stream().max((i,j)->i-j).get();
		
		System.out.println(maximum);
		
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		
	}

}
