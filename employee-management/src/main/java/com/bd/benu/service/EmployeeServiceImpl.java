package com.bd.benu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.model.Employee;
import com.bd.benu.repo.EmployeeRepositary;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositary employeeRepositary;

	@Override
	public Employee createEmployee(Employee employee) {

		return employeeRepositary.save(employee);
	}

	@Override
	public List<Employee> getEmployes() {

		return employeeRepositary.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer empId) {

		return employeeRepositary.findById(empId)
				.orElseThrow(() -> new RuntimeException("Employee Not Found with" + empId));
	}

	@Override
	public boolean deleteEmployeeById(Integer empId) {

		if (employeeRepositary.existsById(empId)) {

			employeeRepositary.deleteById(empId);

			return true;
		}

		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeeRepositary.findById(employee.getEmpId()).map(e -> {
			e.setEmpName(employee.getEmpName());
			e.setEmail(employee.getEmail());
			e.setGender(employee.getGender());
			e.setMobile(employee.getMobile());
			return employeeRepositary.save(employee);
		}).orElse(employee);
	}

}
