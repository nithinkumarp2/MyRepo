package com.jsp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.Dto.EmployeeEntity;

public class EmplyeeDao {

	

	public EmployeeEntity save(EmployeeEntity e)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		if (e !=null) {
			et.begin();
			em.persist(e);
			et.commit();
		}
		return e;
		
	}
	
	
	public EmployeeEntity find(int i)
	{
		EmployeeEntity e=new EmployeeEntity();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		e=em.find(EmployeeEntity.class, i);
		
		 return e;
	}
	
	public EmployeeEntity update(EmployeeEntity e)
	{
//		 EmployeeEntity e=new EmployeeEntity();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		EmployeeEntity e1=em.find(EmployeeEntity.class, e.getId());
		e1.setName(e.getName());
		e1.setAge(e.getAge());
 //	e1.setName("Nithinkumar");
		 if (e1 !=null) 
		{
			
			et.begin();
			em.merge(e1);
			et.commit();
		}
		return e1;
	}
	
	public EmployeeEntity Delete(EmployeeEntity e)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		EmployeeEntity e1=em.find(EmployeeEntity.class, e.getId());
		
		if (e1!=null) {
			et.begin();
			em.remove(e1);
			et.commit();
		}
		return e1;
	}
	public static Query q;
	
	public EmployeeEntity selectAll(EmployeeEntity e)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		
		  q=em.createQuery("select q from EmployeeEntity q");
		
		return e;
		
	}
	
	public EmployeeEntity SelectByName(EmployeeEntity e)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		EntityManager em=emf.createEntityManager();
		
		  q=em.createQuery("select q from EmployeeEntity q where name =?2");
		  
		//  q.setParameter(name,i);
		return e;      
	}
}
