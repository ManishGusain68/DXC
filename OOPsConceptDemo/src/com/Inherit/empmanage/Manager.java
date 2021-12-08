package com.Inherit.empmanage;

import com.Inherit.DXC;

public class Manager extends DXC {

	int bonus;

	public Manager(int id, String name, int salary,int bonus) {
		super(id, name, salary);
		this.bonus=bonus;
	}
	
	public int addBonus(){
		return getSalary()+bonus;
	}

}
