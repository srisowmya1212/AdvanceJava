package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeUpdate {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Employee employee = new Employee();
		employee.setId(2);
		employee.setAge(35);// pass all values bcoz if u pass age only ageonly updated . to get all insert
							// save data all ;but only change what u want to change
		employee.setName("gowrivani");
		employee.setEmail("vani@gmail.com");
		employee.setPassword("vani133");
		Employee employee2 = service.updateEmployee(employee);
		if (employee2 != null) {
			System.out.println("data updated");
		} else {
			System.out.println("plz check the code");
		}

	}

}
