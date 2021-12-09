package com.pack1;

public class Student {

	private int id;
	private String name;
	private Address addr; // has-a relationahip

	public Student(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		System.out.println("cons of Student");
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
		System.out.println("setting addr");
	}

	public Student() {
		super();
		System.out.println("student object created");
	}

	// public Student(int id, String name) {
	// super();
	// this.id = id;
	// this.name = name;
	// }

	public int getId() {
		System.out.println("getting the id");
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setting the id");
	}

	public String getName() {
		System.out.println("getting the name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setting the name");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	public void sayHello() {
		System.out.println("hello from student");
	}

}
