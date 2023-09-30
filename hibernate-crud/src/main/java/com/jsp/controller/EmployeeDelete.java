package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeDelete {
	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		
		Employee employee2=service.deleteEmployee(3);
		if(employee2!=null) {
			System.out.println("data deleted");
		}else {
			System.out.println("plz check the code");
		}
	
		
	}

}
