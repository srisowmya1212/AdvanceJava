package com.jsp.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("second");
	public Employee saveEmployee(Employee employee) {//here the return type employee is dto class name .so it shoulsd be capital e.
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
			
		
		return employee;
	}
	public Employee updateEmployee(Employee employee) {
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee1=entityManager.find(Employee.class, employee.getId());
		
			
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
		return employee1;
		
		
	}
	public Employee deleteEmployee(int id) {
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, id);
		
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			
		
		return employee;
		
	}
	public List<Employee> getAllEmployee(){
	
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> list=query.getResultList();
		
		return list;
	}
	public Employee getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class, id);
		return employee;
	}
    public List<Employee> login(Employee employee) {
    	
    	EntityManager entityManager=entityManagerFactory.createEntityManager();
    	Query query=entityManager.createQuery("select e from Employee e where email=?10 and  password=?11");
    	query.setParameter(10, employee.getEmail());
    	query.setParameter(11, employee.getPassword());
    	
    	List<Employee> list= query.getResultList();
         if (list.size()!=0) {
        	 for (Employee employee2 : list) {
				if(employee2.getEmail().equals(employee.getEmail())&& employee2.getPassword().equals(employee.getPassword())) {
					return list;
				}
			}
			
		}
		return null;
	
    
    }
}
