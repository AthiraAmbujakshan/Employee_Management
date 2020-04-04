package com.cognizant.EmployeeManagement.dao;

import java.util.List;

import com.cognizant.EmployeeManagement.entity.Employee;





public interface EmployeeDAO {
	public List<Employee>getAllEmployees();
	public void saveEmployee(Employee theEmployee);
	public  Employee getEmployee(int theId);
	
	public void deleteEmployee(int theId);
	
}
