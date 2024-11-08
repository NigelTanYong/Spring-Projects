package com.springboot.demo.springboot_demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.demo.springboot_demo.model.Employee;

//contains the APIs for basic CRUD operations, the APIS for pagination, and the APIs for sorting
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ //extends so we can use the jpa function in service

}
