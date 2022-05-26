package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Employee;

@Repository //this annotation always apply to the DAO impl
public class EmployeeDAOImpl implements EmployeeDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

}