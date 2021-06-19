package com.springboot.app.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	static List<Employee> list = new ArrayList<>();
	
	static {
		list.add(new Employee(1234, "Nancy", "nancy@gmail.com"));
		list.add(new Employee(1243, "Dan", "dabiel@gmail.com"));
		list.add(new Employee(1334, "Gran", "jan@gmail.com"));
	}
	
	public List<Employee> getAllEmployees(){
		return list;
	}

	public Employee getAllEmployeesById(int empId) {
		return list.stream()
				.filter(emp -> emp.getEmployeeId()==empId)
				.findAny()
				.orElse(null);
	}

	public void saveEmployee(Employee emp) {
		emp.setEmployeeId(list.size()+1);
		list.add(emp);
	}
}
