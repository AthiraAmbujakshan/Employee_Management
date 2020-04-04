package com.cognizant.EmployeeManagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.EmployeeManagement.entity.Employee;
import com.cognizant.EmployeeManagement.service.EmployeeService;





@Controller
@RequestMapping("/employee")

public class EmployeeController {

		@Autowired
		EmployeeService employeeService;
		@RequestMapping("/list")
	public String listEmployee(Model theModel) {
			List<Employee>employees=employeeService.getAllEmployees();
			theModel.addAttribute("employees",employees);
			System.out.println(employees);
		return "employee-list";
	}
		@RequestMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			Employee employee=new Employee();
			theModel.addAttribute("employee",employee);
			return "employee-form";
		}
		@RequestMapping("/saveEmployee")
		public String saveEmployee( @ModelAttribute("employee")
		Employee theEmployee) {
		/*{
			System.out.println(bindingResult);
			if(bindingResult.hasErrors())
			{
				System.out.println(bindingResult);
				return "employee-form";
			}
			else {*/
			employeeService.saveEmployee(theEmployee);
				return "redirect:/employee/list";
		
		}
		@RequestMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("EmployeeId")
		                   int theId,Model theModel)
		{
			Employee theEmployee=employeeService.getEmployee(theId);
					theModel.addAttribute("employee",theEmployee);
			
		
			return "employee-update-form";
		}
		
		
		
		@RequestMapping("/delete")
		public String delete(@RequestParam("EmployeeId")int theId) {
			employeeService.deleteEmployee(theId);
			return "redirect:/employee/list";
		}
		
		
}