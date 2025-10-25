package com.bd.benu.service;

import java.util.List;

import com.bd.benu.model.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);

	public List<Employee> getEmployes();

	public Employee getEmployeeById(Integer empId);

	public boolean deleteEmployeeById(Integer empId);

	public Employee updateEmployee(Employee  employee);

}
