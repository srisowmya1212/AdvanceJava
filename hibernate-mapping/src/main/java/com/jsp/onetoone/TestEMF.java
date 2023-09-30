package com.jsp.onetoone;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEMF {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("third");
		System.out.println(entityManagerFactory);

	}

}
