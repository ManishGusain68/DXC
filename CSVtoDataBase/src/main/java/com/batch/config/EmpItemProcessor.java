package com.batch.config;



import org.springframework.batch.item.ItemProcessor;

import com.batch.model.Emp;

public class EmpItemProcessor implements ItemProcessor<Emp, Emp>{

	@Override
	public Emp process(Emp emp) throws Exception {
		
		
		return emp;
	}

	

}
