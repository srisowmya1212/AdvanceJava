package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.dto.Hospital;

@Component

public class HospitalDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("springmvc");
	public Hospital save(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
		
	}
	public Hospital delete(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, id);
		if(hospital!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		return hospital;
	}
	public Hospital update(Hospital hospital) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital2=entityManager.find(Hospital.class, hospital.getId());
		if(hospital2!=null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
		}
		return hospital2;
		
	}
	
	public List<Hospital> getAll(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select h from Hospital h");
		List<Hospital> list=query.getResultList();
		return list;
	}
	
	public Hospital getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hospital hospital=entityManager.find(Hospital.class, id);
		return hospital;
	}
		
	
	

}
