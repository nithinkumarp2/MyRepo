package com.jsp.Dao;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dto.EmployeeDto;

public class EmployeeDao extends HttpServlet {

	public EmployeeDto SaveDetails(EmployeeDto employee) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		if (employee != null) {
			et.begin();
			em.persist(employee);
			et.commit();
		}
		return employee;
	}

	public EmployeeDto UpdateEmployee(EmployeeDto employee) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		EmployeeDto employee1 = em.find(EmployeeDto.class, employee.getId());
		employee1.setId(employee.getId());
		employee1.setFirstName(employee.getFirstName());
		employee1.setLastName(employee.getLastName());
		employee1.setAge(employee.getAge());
		employee1.setEmail(employee.getEmail());
		employee1.setPassword(employee.getPassword());

		if (employee1 != null) {

			et.begin();
			em.merge(employee1);
			et.commit();
		}
		return employee1;
	}

	public EmployeeDto Deleteemployee(int i) {
		EmployeeDto employee = new EmployeeDto();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		EmployeeDto employee1 = em.find(EmployeeDto.class, i);
		employee1.setId(employee.getId());

		if (employee1 != null) {
			et.begin();
			em.remove(employee1);
			et.commit();
		}
		return employee1;
	}

	public static List<EmployeeDto> list;

	public EmployeeDto GetAllDetails() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nithin");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from EmployeeDto a ");
		list = q.getResultList();

		return new EmployeeDto();
	}
}