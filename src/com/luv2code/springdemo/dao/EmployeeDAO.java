package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
}
