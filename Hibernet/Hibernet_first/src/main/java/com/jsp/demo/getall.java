package com.jsp.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class getall {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		
		
	Query query=em.createQuery("select a from user a");
	List<user>	list=query.getResultList();
		
		for (user user : list ) {
			
			System.out.println("USER ID : "+user.getId());
			System.out.println("USER NAME : "+user.getName());
			System.out.println("USRE AGE : "+user.getAge());
			System.out.println("------------------------------------------");
		}
	}
}
