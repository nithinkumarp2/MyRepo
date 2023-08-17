package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selection {

	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			Statement statement=connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from employee ");
			
			while(rs.next()) {
				String id=rs.getString(1);
				String name=rs.getString(2);
				String age=rs.getString(3);
				String phone=rs.getString(4);
				System.out.println("id="+id+" name="+name+" age="+age+" ph="+phone);
				
			}
			 connection.close();
			System.out.println("selected all successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
