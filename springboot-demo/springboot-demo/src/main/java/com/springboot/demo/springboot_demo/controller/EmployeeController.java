package com.springboot.demo.springboot_demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.springboot_demo.model.Employee;
import com.springboot.demo.springboot_demo.model.Salary;
import com.springboot.demo.springboot_demo.service.EmployeeService;
//combines the functionality of Controller and ResponseBody annotations,
//simplifying the creation of controllers that return data directly to the client
@RestController
//map requests to controllers methods
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired // enables dependency injection for Java classes
	private EmployeeService service;
	
	 @GetMapping //mapping HTTP GET requests onto specific handler methods
	    public List<Employee> getAllEmployees() {
	        return service.getEmployees();
	    }

	 @GetMapping("/{id}")
	 public Optional<Employee> getEmployeeById(@PathVariable int id) { //pathvariable: so you can put in the url
		 return service.getEmployeeById(id) ;
	 }
	 @GetMapping("/salary/{id}")//get salary of the by id
	 public Optional<Salary> getSalaryById(@PathVariable int id){
		 return service.getSalaryById(id) ;

	 }

	 @PostMapping //map HTTP POST requests onto specific handler methods
	 public Employee addEmployee(@RequestBody Employee employee) { //requestbody as json
		 return service.addEmployee(employee);
	 }
	 
	 @PostMapping("/{id}/savesalary") //map HTTP POST requests onto specific handler methods
	 public Salary saveSalaryEmployee(@PathVariable("id") int employeeId, @RequestBody Salary salary) {
		 return service.saveSalaryEmployee(employeeId, salary);
	 }

	

}

