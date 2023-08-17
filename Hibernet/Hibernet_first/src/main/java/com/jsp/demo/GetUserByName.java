package com.jsp.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetUserByName {

	public static void main(String[] args) {
		 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("select a from user a where name =?1");
		q.setParameter(1, "kumar");
		
		List<user> list=q.getResultList();
		
		for (user user : list) {
			System.out.println("UASER ID : "+user.getId());
			System.out.println("USER NAME : "+user.getName());
			System.out.println("USER AGE : "+user.getAge());
		}
	}

}

