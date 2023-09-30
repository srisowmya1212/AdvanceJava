package com.jsp.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrud.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
