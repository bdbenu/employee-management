package com.bd.benu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.benu.model.Employee;
import com.bd.benu.service.EmployeeService;

@RestController
@RequestMapping("/employee/rest")
public class EmployeeRestController {
	
	//System

	@GetMapping("/test")
	public String api() {
		
	System.out.println("Hi hello how are you");
		return "API TESTD";
	}

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/post/created")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		ResponseEntity<?> response = null;

		Employee createEmployee = employeeService.createEmployee(employee);
		if (createEmployee != null) {

			response = new ResponseEntity<>(HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		}

		return response;
	}
	

	

}
