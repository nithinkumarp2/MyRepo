package com.jsp.EmployeeDao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.EmployeeEntity;

public class Dao {

//	public void createtable() {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nithin");
//		System.out.println(entityManagerFactory);
//	}

	

	public EmployeeEntity save(EmployeeEntity e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (e != null) {
			et.begin();
			em.persist(e);
			et.commit();
		}
		return e;
	}
	// -------------------------------------------------

	public EmployeeEntity find(int i) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		EmployeeEntity e = em.find(EmployeeEntity.class, i);
		if (e != null) {
			et.begin();
			em.find(EmployeeEntity.class, e.getId());
			et.commit();
		}
		return e;

	}
	// ======================================================
	public   EntityManager em;
	public EmployeeEntity update(EmployeeEntity e) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		  em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
// EmployeeEntity e=new EmployeeEntity();
  	 EmployeeEntity e1=em.find(EmployeeEntity.class,e.getId());
  	 e1.setName(e.getName());
  	 e1.setAge(e.getAge());
 //	 e1.setName("nithin");
		if (e1 != null)
		{

			et.begin();
			em.merge(e1);
			et.commit();
		}
		return e1;

	}
	// ----.................>>>>>>>>>.

	public EmployeeEntity delete(int i) {
		EmployeeEntity e = new EmployeeEntity();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		e = em.find(EmployeeEntity.class, e.getId());
		if (e != null) {

			et.begin();
			em.remove(e);
			et.commit();
		}
		return e;
	}
	// >>>>>>>>>>>>>>>>>................

	// public static final EmployeeEntity[] list = null;

	public static Query q;
	public EmployeeEntity selectall(EmployeeEntity e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();

		  q = em.createQuery("select q from EmployeeEntity q");
//		List<EmployeeEntity> list = q.getResultList();
//
//		for (EmployeeEntity emp : list) {
//			System.out.println("USER ID : " + emp.getId());
//			System.out.println("USER NAME : " + emp.getName());
//			System.out.println("USER AGE : " + emp.getAge());
//			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		}
		return e;
	}
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public EmployeeEntity SelectByName(String name,int i) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
          EntityManager em=emf.createEntityManager();
          
           q=em.createQuery("select q from EmployeeEntity q where name=?"+i);
          q.setParameter(i,name);
//          List<EmployeeEntity> list =q.getResultList();
//          
//          for (EmployeeEntity emp : list) {
//  			System.out.println("USER ID : " + emp.getId());
//  			System.out.println("USER NAME : " + emp.getName());
//  			System.out.println("USER AGE : " + emp.getAge());
//  			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//  		} 
		return new EmployeeEntity();

	}
}
