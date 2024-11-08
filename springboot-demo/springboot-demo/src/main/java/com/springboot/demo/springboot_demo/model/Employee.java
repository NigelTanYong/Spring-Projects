package com.springboot.demo.springboot_demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  //to auto generate id
	private int empId;
	private String name;
	private String gender;
	
	@OneToOne(mappedBy = "employee", cascade=CascadeType.ALL) //mapped to employee object in salary; mappedBy is for the owner of the relationship
    private Salary salary; 
	//get and set - no need getter and setter if we use lombok
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
//	public Salary getSalary() {
//		return salary;
//	}
//	public void setSalary(Salary salary) {
//		this.salary = salary;
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
	    
	    
}

