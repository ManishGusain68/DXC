package com.ConfigClassDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ConfigClassDemo")
public class JavaConfig {
	@Bean
	public Teacher getTeacher(){
		Teacher t=new Teacher(getEvent());
		return t;
	}
	
	public Event getEvent(){
		Event e=new Event();
		return e;
	}
	
	

}
