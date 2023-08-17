package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 

public class demo1 {
   public static void main(String[] args) {
	  
	try {
		 String Query = "create table employee(id int primary key,name varchar(45),age int,phone bigint(10))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
		Statement st= con.createStatement();
		st.execute(Query);
		con.close();
		System.out.println("created table");
	} catch (ClassNotFoundException e) {
		 
		System.out.println(e.getMessage());
	} catch (SQLException e) {
        System.out.println(e.getMessage());
	}
}
}
