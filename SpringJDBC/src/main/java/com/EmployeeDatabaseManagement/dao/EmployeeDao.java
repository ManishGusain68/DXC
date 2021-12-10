package com.EmployeeDatabaseManagement.dao;

import java.util.List;
import java.util.Map;

import com.EmployeeDatabaseManagement.entity.Employee;

public interface EmployeeDao {

	int insert(Employee e);

	Map<String, Object> findEmployee(int id);

}
