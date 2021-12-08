package com.serializedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student std1 = new Student(112, "Samar", "Delhi");
		System.out.println(std1);

		String filename = "C:\\Users\\Manish Gusain\\OneDrive\\Desktop\\DXC\\Test.txt";
			
		FileOutputStream fileout=new FileOutputStream(filename);
		
		ObjectOutputStream objout=new ObjectOutputStream(fileout);
		
		objout.writeObject(std1);
		
		objout.close();
		fileout.close();
		System.out.println("object is serialized");
		
		
		//Deserialization
		
		
		FileInputStream filein=new FileInputStream(filename);
		ObjectInputStream objin= new ObjectInputStream(filein);
		
		Student std=(Student)objin.readObject();
		System.out.println("*****************************************************");
		System.out.println(std);
		
		filein.close();
		objin.close();
		
	}

}
