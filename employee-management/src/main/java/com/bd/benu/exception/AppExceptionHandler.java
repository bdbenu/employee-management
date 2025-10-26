package com.bd.benu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<?> handelEmployeeNotFoundException(EmployeeNotFoundException exp) {

		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}

}
