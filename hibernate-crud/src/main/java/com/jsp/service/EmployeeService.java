package com.jsp.service;



import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	EmployeeDao dao = new EmployeeDao();

	public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}
	public Employee deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}
	public List<Employee> getAllEmployee(){
		return dao.getAllEmployee();
	}
	public Employee getById(int id) {
		return dao.getById(id);
	}
	public List<Employee> login(Employee employee){
		return dao.login(employee);
	}
}
