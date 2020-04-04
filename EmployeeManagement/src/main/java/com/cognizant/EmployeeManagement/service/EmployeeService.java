package com.cognizant.EmployeeManagement.service;

import java.util.List;

import com.cognizant.EmployeeManagement.entity.Employee;





public interface EmployeeService {
	List< Employee>getAllEmployees();
	void saveEmployee(Employee theEmployee);
	Employee getEmployee(int theId);
	
	void deleteEmployee(int theId);
}
