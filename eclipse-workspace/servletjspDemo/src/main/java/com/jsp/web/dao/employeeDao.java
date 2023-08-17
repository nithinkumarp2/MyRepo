package com.jsp.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jsp.web.model.employee;

public class employeeDao {

	
	public employee getemployee(int id)
	{
		employee e=new employee();
//		 e.setId(1);
//		 e.setName("nithin");
//		 e.setAge(22);
//		 e.setPhno(999998888877l);
//		 
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			Statement statement=connection.createStatement();
			
			ResultSet rs=statement.executeQuery("select * from employee where id=" +id);
			
			if (rs.next()) {
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAge(rs.getInt(3));
				e.setPhno(rs.getLong(4));
			}
		} catch ( Exception e1) {
			 
			e1.printStackTrace();
		}
		 
		 return e;
	}
}
