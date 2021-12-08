package com.constructorOverloading;

public class ConstrutorDemo {

	int length;
	int width;
	int height;

	ConstrutorDemo(int length, int width) {

		this.length = length;
		this.width = width;
		this.height=10;
		System.out.println("int constructor");

	}
	ConstrutorDemo(double length,double width){
		this.length = (int) length;
		this.width = (int) width;
		this.height=199;
		System.out.println("double constructor");
		
	}
	

	ConstrutorDemo(int height) {
           this.height=height;
	}
	
	int volume(){
		return length*width*height;
	}

}
