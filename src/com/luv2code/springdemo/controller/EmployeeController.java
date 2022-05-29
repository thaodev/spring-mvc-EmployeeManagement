package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		//create a employee object
		Employee employee = new Employee();
		
		//provide employee object to the model
		theModel.addAttribute("employee", employee);
		
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	//@ModelAttribute binds form data to the object
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		
		//save the customer using our service
		employeeService.saveEmployee(theEmployee);
		
		return "employee-register";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
							Model theModel) {
		
		//get the employee from the database
		Employee theEmployee = employeeService.getEmployee(theId);
		
		//set employee as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theEmployee);
		
		//send over to our form
		
		return "employee-form";
	}
}
