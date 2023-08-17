package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveuser {

	public static void main(String[] args) {
	 user user= new user();
	 user.setId(1);
	 user.setName("ntihin");
	 user.setAge(24);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nithin");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(user);
	entityTransaction.commit();
}
}