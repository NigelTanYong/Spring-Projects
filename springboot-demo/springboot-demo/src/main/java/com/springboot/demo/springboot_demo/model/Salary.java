package com.springboot.demo.springboot_demo.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Salary {
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  //to auto generate id
	private int id;
	private int salary;
	
	//helps us specify the column we'll use for joining an entity association or element collection
	 @OneToOne
	 //helps us specify the column we'll use for joining an entity association or element collection
	 @JoinColumn(name = "employee_id", referencedColumnName = "empId")  //the id is from employee 
	 private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee getEmployee() {
		return employee;
	}
//
	public void setEmployee(Employee employee) {
				this.employee = employee;

	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", salary=" + salary + ", employee=" + employee + "]";
	}
	

//	public void setEmployee(Optional<Employee> employee2) {
//		// TODO Auto-generated method stub
//		this.employee = employee;
//	}

	
	 
	 
}

