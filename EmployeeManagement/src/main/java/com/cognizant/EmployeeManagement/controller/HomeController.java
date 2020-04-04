package com.cognizant.EmployeeManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.EmployeeManagement.entity.Admin;


@Controller
public class HomeController {
 @RequestMapping("/")	
public String displayWelcomePage() {
	return "login-page";
}
 @RequestMapping("/submitadmin")
 public String login(@ModelAttribute("admin")Admin theAdmin)
	{
		System.out.println(theAdmin.getUserName());
		System.out.println(theAdmin.getPassword());
	if(theAdmin.getUserName().equals("admin")
		&& (theAdmin.getPassword().equals("admin123")))	{
		
	
			return "redirect:/employee/list";
	}
	else
	{ return  "login-failed"; 
	}
	}
 
}
