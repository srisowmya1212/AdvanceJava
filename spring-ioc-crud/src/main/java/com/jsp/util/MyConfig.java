package com.jsp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")

public class MyConfig {
	
//	public EntityManagerFactory createEntityManagerFactory() {
//		return Persistence.createEntityManagerFactory("spring");
//	}

}
