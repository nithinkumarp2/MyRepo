package com.jsp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.jsp.Dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	EntityManagerFactory emf;

	public Employee saveEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		if (employee != null) {
			et.begin();
			em.persist(employee);
			et.commit();
		}
		return employee;
	}


 public static	List<Employee> list;
 	
	public Employee getAllDetails() {
		EntityManager em = emf.createEntityManager();

		Query q =   em.createQuery("select a from Employee a");

		list = q.getResultList();
//
//		for (Employee employee : list) {
//			System.out.println("employee id : "+employee.getId());
//			System.out.println("employee name : "+employee.getName());
//			System.out.println("employee age : "+employee.getAge());
//		}
		return new Employee();
	}

public Employee update(Employee employee)
{
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Employee employee1= em.find(Employee.class, employee.getId());
	employee1.setName(employee.getName());
	employee1.setAge(employee.getAge());

	if (employee1!=null) {
		et.begin();
		em.merge(employee1);
		et.commit();
	}
	return employee1;
}

public Employee delete(Employee employee)
{
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Employee employee1=em.find(Employee.class, employee.getId());
	if (employee1!=null) {
		et.begin();
		em.remove(employee1);
		et.commit();
	}
	return employee1; 
}
}
