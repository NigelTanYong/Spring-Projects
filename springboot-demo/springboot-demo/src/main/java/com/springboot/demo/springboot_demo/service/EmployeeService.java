package com.springboot.demo.springboot_demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.springboot_demo.model.Employee;
import com.springboot.demo.springboot_demo.model.Salary;
import com.springboot.demo.springboot_demo.repository.EmployeeRepository;
import com.springboot.demo.springboot_demo.repository.SalaryRepository;


@Service
public class EmployeeService {

	@Autowired //to say we are using the repo class
	private EmployeeRepository empRepo;
	@Autowired //to say we are using the repo class
	private SalaryRepository salRepo;
	
	public List<Employee> getEmployees(){
		return empRepo.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
        return empRepo.findById(id);
    }

    public Employee addEmployee(Employee employee) {
        return empRepo.save(employee);
        
    }
    
    //get salary by id
    public Optional<Salary> getSalaryById(int id) {
        return salRepo.findById(id);
    }
    
    public Salary saveSalaryEmployee(int employeeId, Salary salary) {
    	Employee employee = empRepo.findById(employeeId).orElse(null); //get the employee object through the repo
    	if (employee != null) { //ensure it is not null
    		salary.setEmployee(employee); // set into the salary object
    		
    	}
    	return salRepo.save(salary); //return the saved object
    }
    
    
    
}

