package com.EmbedDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EmployeeManagement")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String name;
	private int salary;
	private Certificate certi;
	public Employee(String name, int salary, Certificate certi) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.certi = certi;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
