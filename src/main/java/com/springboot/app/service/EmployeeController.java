package com.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.exception_handler.EmployeeNotFound;
import com.springboot.app.model.Employee;
import com.springboot.app.model.EmployeeDao;

import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao service;
	
	@GetMapping("/employees")
	public List<Employee> getAll(){
		return service.getAllEmployees();
	}
	
	@GetMapping("employees/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		Employee employee = service.getAllEmployeesById(empId);
		if(null == employee)
			throw new EmployeeNotFound("Employee not found!");
		return employee;
	}
	
	@PostMapping("employees/user")
	public void saveEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
	}
}
