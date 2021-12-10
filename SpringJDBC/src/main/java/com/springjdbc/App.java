package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/Config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbctemplate");
		String query = "insert into Employee(id,name,city) values(?,?,?)";

		int result = template.update(query,100, "Shweta", "Bangalore");
		System.out.println("number of records inserted...." + result);
	}
}
