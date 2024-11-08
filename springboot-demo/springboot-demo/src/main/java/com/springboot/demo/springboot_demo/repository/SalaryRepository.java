package com.springboot.demo.springboot_demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.demo.springboot_demo.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}

