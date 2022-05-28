package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.dao.EmployeeDAO;
import com.luv2code.springdemo.entity.Employee;
import com.luv2code.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	//need to inject the DAO
	@Autowired
	private EmployeeService employeeService;
	
	//need a controller method to show the initial HTML form
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		
		
		//get customers from the dao
		List<Employee> theEmployees = employeeService.getEmployees();
		
		//add the customers to the model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";	
	}
	//need a controller method to process the HTML form
	
}
