package com.autowiringXML;

public class Address {

	private int pincode;
	private String name;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", name=" + name + "]";
	}

}
