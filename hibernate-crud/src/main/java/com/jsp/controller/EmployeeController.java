package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		Employee employee=new Employee();
		employee.setId(3);
		employee.setName("arunsai");
		employee.setAge(20);
		employee.setEmail("arunsai@gmail.com");
		employee.setPassword("arunsai123");
		Employee employee2=service.saveEmployee(employee);
		if(employee2!=null) {
		System.out.println("data saved from controller layer");
		}else {
			System.out.println("plz check the code");
		}
		

	}

}
