package com.serializedemo;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	int id;
	String name;
	String city;

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "version is :" + serialVersionUID + "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
