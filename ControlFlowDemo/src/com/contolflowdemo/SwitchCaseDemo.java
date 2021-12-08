package com.contolflowdemo;

public class SwitchCaseDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int month=8;
		
		String monthName;
		
		switch(month)
		{
		case 1: monthName="January";
		break;
		
		case 2: monthName="February";
		break;
		
		case 3: monthName="March";
		break;
		
		default : monthName="Invalid";
		break;
		
		}
		
		System.out.println(monthName);
		
		Class cls=Class.forName("com.contolflowdemo.SwitchCaseDemo");
		System.out.println(cls.getClassLoader());
	}

}
