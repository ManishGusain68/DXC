package com.EmployeeDatabaseManagement.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.EmployeeDatabaseManagement.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee e) {

		String query = "insert into Employee(id,name,city) values(?,?,?)";
		int result = jdbcTemplate.update(query, e.getId(), e.getName(), e.getCity());
		return result;
	}

	public Map<String, Object> findEmployee(int id) {
		String query = "select * from Employee where id= ?";
		Map<String, Object> listOfEmployee =jdbcTemplate.queryForMap(query, id);
		return listOfEmployee;
	}

}
