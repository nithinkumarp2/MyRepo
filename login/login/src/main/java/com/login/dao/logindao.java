package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.login.logindto;

public class logindao {

	public boolean check(String name,String password)
	{
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
//			PreparedStatement preparedStatement=connection.prepareStatement("select * from logindao where name=? and password=?");
//			preparedStatement.setString(1, name);
//			preparedStatement.setString(2, password);
//			ResultSet rs=preparedStatement.executeQuery();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
		 EntityManager em=emf.createEntityManager();
		
		 Query q=em.createQuery("select a from logindto a where name=?1 and password=?2");
		 q.setParameter(1, name);
		 q.setParameter(2, password);
		List<logindto> list=q.getResultList();
		 //if(rs.next())
			if (list.size()>0) {
				return true;
			}
//		} catch (ClassNotFoundException | SQLException e) {
//			 
//			e.printStackTrace();
//		}
		
		return false;
	}
}
