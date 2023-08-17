package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hibernate {

	public static void main(String[] args) {

		persondetails ps=new persondetails();
		ps.setPassword("username");
		ps.setPassword("password");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(ps);
		et.commit();
	}

}
