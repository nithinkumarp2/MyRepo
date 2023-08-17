package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Dto.user;

@Component
public class UserDao {
@Autowired
	EntityManagerFactory emf;
public Object list;
	public user save(user user)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		if (user!=null) {
			et.begin();
			em.persist(user);
			et.commit();
		}
		return user;
	}
	
	public user update(user user)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		user user1= em.find(user.class, user.getId());
		user1.setName(user.getName());
		user1.setAge(user.getAge());
		if (user1!=null) {
			et.begin();
			em.merge(user1);
			et.commit();
		}
		return user1;
	}
	
	public user delete(user user)
	{
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		user user1=em.find(user.class, user.getId());
		if (user1!=null) {
			et.begin();
			em.remove(user1);
			et.commit();
		}
		return user1;
		
	}
	
//	public static Query q;
//	public static List<user> list;
	public List<user> getAll(user user)
	{
		EntityManager em=emf.createEntityManager();
		
		 Query q=em.createQuery("select u from user u");
		 List<user> list=q.getResultList();
		 
		return list ;
	}
}
