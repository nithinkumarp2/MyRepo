package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class second_way_of_connection {

	public static void main(String[] args) {
		 try {
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=root");
			System.out.println(connection);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}
