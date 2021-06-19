package com.springboot.app.exception_handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class EmployeeGlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
		EmployeeExceptionsResponse exception = new EmployeeExceptionsResponse(ex.getMessage(), request.getDescription(false), new Date());
	
		return new ResponseEntity<Object>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
