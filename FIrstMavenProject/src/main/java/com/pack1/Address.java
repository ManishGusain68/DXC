package com.pack1;

public class Address {

	private int pincode;
	private String city;

	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
		System.out.println("cons of address");
	}

	public Address() {
		super();
		System.out.println("address object created");
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}

	public void sayHi() {
		System.out.println("Hi from Address class");
	}

}
