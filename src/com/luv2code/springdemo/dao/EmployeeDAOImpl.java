package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Employee;

@Repository //this annotation always apply to the DAO impl
public class EmployeeDAOImpl implements EmployeeDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployees() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create a query .. sort by first name
		Query<Employee> theQuery = currentSession.createQuery("from Employee order by firstName", Employee.class);
		
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}

	@Override
	public void saveEmployee(Employee theEmployee) {
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the employee to db
		currentSession.saveOrUpdate(theEmployee);
	}

	@Override
	public Employee getEmployee(int theId) {
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//retrieve/read from database using the primary key
		Employee theEmployee = currentSession.get(Employee.class, theId);
	
		return theEmployee;
	
	}

}
