package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveById {

	static int id = 1;
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nithin");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		user user=entityManager.find(user.class, id);
		
		entityTransaction.begin();
		entityManager.remove(user);
		entityTransaction.commit();
		
//		System.out.println("deleted successfully");
	}
}
