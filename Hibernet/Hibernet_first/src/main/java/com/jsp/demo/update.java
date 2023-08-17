package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {

	public static void main(String[] args) {
		
//		user user=new user();
//		user.setName("kumar");
//		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nithin");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		user user=entityManager.find(user.class, 1);
		user.setName("kuma");
		entityTransaction.begin();
		entityManager.merge(user);
		entityTransaction.commit();
	}
}
