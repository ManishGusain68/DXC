package com.EmployeeDatabaseManagement;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.EmployeeDatabaseManagement.dao.EmployeeDaoImpl;
import com.EmployeeDatabaseManagement.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/EmployeeDatabaseManagement/EmpConfig.xml");
		EmployeeDaoImpl stddao = (EmployeeDaoImpl) context.getBean("empdao");
		
		//inserting data in the database
//		Employee e1 = new Employee(767, "Kusuma", "Paris");
//		int result = stddao.insert(e1);
//		System.out.println("Number of rows inserted" + result);
		
		
		//Selecting data from database
		Map<String, Object> e=stddao.findEmployee(100);
		System.out.println(e);

	}

}
