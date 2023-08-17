package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class regiisterDriver {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
			Statement statement=connection.createStatement();
			boolean b=statement.execute("select * from employee where id=123");
			connection.close();
			System.out.println("data printed");
			System.out.println(b);
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
	}

}
