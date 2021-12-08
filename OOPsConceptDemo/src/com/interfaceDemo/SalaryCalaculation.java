package com.interfaceDemo;

public interface SalaryCalaculation {
	
	//before java 8 only constants and abstract methods were allowed
	
	 int bonus=10000; //constant
	 
	 int addBonus(); //abstract method
	
	default void extraBonus(){
		System.out.println("extra bonus"); 
	}
	

}
