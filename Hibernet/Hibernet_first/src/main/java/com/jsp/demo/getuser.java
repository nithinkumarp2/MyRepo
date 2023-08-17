package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class getuser {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nithin");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	user user =entityManager.find(user.class, 1);
	
	
	if (user !=null) {
		System.err.println("user id : "+user.getId());
		System.out.println("user name : "+user.getName());
		System.out.println("user age : "+user.getAge());
	}
	
	else {
		System.out.println("data not fouund");
	}
	
}
}
