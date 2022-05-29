package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.EmployeeDAO;
import com.luv2code.springdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//Service depends on DAO => Inject the dependency
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		return employeeDAO.getEmployees();
	}


	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		employeeDAO.saveEmployee(theEmployee);
		
	}


	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		return employeeDAO.getEmployee(theId);
	}

}
