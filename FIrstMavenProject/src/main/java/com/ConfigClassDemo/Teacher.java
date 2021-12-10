package com.ConfigClassDemo;

public class Teacher {

	private int id;

	private String name;

	private Event event;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Event event) {
		super();
		this.event = event;
	}

	public int getId() {
		return id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
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

	public void training() {
		System.out.println("Manish is training DXC employees");
		event.org();
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

}
