package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeLogin {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Employee employee = new Employee();
		employee.setEmail("vani@gmail.com");
		employee.setPassword("vani133");
		List<Employee> list=service.login(employee);
		for(Employee employee2:list) {
			System.out.println("--------------------------------------");
			System.out.println("employee id: " + employee2.getId());
			System.out.println("employee name: " + employee2.getName());
			System.out.println("employee age: " + employee2.getAge());
			System.out.println("employee email: " + employee2.getEmail());
			System.out.println("employee password: " + employee2.getPassword());
			System.out.println("----------------------------------------");

		}

		
		
	}

}
