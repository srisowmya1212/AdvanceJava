package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Person;

@Component
public class PersonDao {
  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("spring");
//	@Autowired
//	EntityManagerFactory entityManagerFactory;
	public Person save(Person person) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		return person;
		
		
	}
	public Person update(Person person) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person2=entityManager.find(Person.class, person.getId());
		if(person2 != null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}
		return person2;
	}
	public Person delete(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, id);
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
		return person;
	}
	public List<Person> getAllData(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person p");
		List<Person> list=query.getResultList();
		return list;
	}
	public List<Person> login(Person person){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person p where email=?1 and password=?2");
		query.setParameter(1,person.getEmail());
		query.setParameter(2, person.getPassword());
		List<Person> list=query.getResultList();
		return list;
	}
	
	public Person getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, id);
		return person;
	}
    
}
