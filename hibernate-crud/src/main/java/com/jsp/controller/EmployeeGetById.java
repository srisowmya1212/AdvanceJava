package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeGetById {
	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		Employee employee=service.getById(2);
		if(employee!=null) {
			System.out.println("Employee id: "+employee.getId());
			System.out.println("Employee name: "+employee.getName());
			System.out.println("employee age: " + employee.getAge());
			System.out.println("employee email: " + employee.getEmail());
			System.out.println("employee password: " + employee.getPassword());
			System.out.println("----------------------------------------");

		}
	}

}
