package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.dto.Student;

@Component
public class StudentDao {

	public Student save(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (student != null) {
			et.begin();
			em.persist(student);
			et.commit();
		}
		return student;
	}

	public Student UpDate(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student student1 = em.find(Student.class, student.getId());
		student1.setName(student.getName());
		student1.setAge(student.getAge());
		if (student1 != null) {
			et.begin();
			em.merge(student1);
			et.commit();
		}
		return student1;
	}

	public Student Delete(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student student1 = em.find(Student.class, student.getId());

		if (student1 != null) {
			et.begin();
			em.remove(student1);
			et.commit();
		}
		return student1;

	}

	public List<Student> GetAll(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Student s");

		return q.getResultList();
//		for (Student student1 : list) {
//			System.out.println("sudent id : "+student1.getId());
//			System.out.println("sudent name : "+student1.getName());
//			System.out.println("sudent age : "+student1.getAge());
//		}

	}

	public Student GetById(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select s from Student s where id=?1");
		q.setParameter(1, student.getId());

		List<Student> list = q.getResultList();
//		for (Student student1 : list) {
//			System.out.println("sudent id : "+student1.getId());
//			System.out.println("sudent name : "+student1.getName());
//			System.out.println("sudent age : "+student1.getAge());
//		}

		return student;
	}

}
