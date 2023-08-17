package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.EmployeeEntity;

public class EmployeeDao {

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

	public EmployeeEntity find(int i) {
		EmployeeEntity e = new EmployeeEntity();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		e = em.find(EmployeeEntity.class, i);

		return e;
	}

	public static EntityManager em;

	public EmployeeEntity update(EmployeeEntity e) {
//		 EmployeeEntity e=new EmployeeEntity();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		EmployeeEntity e1 = em.find(EmployeeEntity.class, e.getId());
		// e1.setName("Nithinkumar");
		e1.setName(e.getName());
		e1.setAge(e.getAge());
		if (e1 != null) {

			et.begin();
			em.merge(e1);
			et.commit();
		}
		return e1;
	}

//	public static EntityManager em;
	public EmployeeEntity Delete(EmployeeEntity e) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		EmployeeEntity e1 = em.find(EmployeeEntity.class, e.getId());

		if (e1 != null) {
			et.begin();
			em.remove(e1);
			et.commit();
		}
		return e1;
	}

	 
 
	public List<EmployeeEntity> SelectAll() {
		//=new ArrayList<>();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from EmployeeEntity a");
		List<EmployeeEntity> list=q.getResultList();

		return list;
	}
}
