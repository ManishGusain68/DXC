package com.sort;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.id-arg1.id;
	}

}
