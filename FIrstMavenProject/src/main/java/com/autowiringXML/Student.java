package com.autowiringXML;

public class Student {

	private int id;
	private String name;
	private Address addr;

	public Student() {
		super();
	}

	public Student(Address addr) {
		super();

		this.addr = addr;
		System.out.println("Student param cons");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

}
