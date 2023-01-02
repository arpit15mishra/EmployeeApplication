package com.example.EmployeeApplication.service;

import java.util.List;
import java.util.Optional;

import com.example.EmployeeApplication.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(long id);
	public Employee save(Employee emp);
	
}