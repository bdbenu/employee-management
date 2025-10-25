package com.bd.benu.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bd.benu.model.Employee;
public interface EmployeeRepositary extends JpaRepository<Employee, Serializable>{

}
