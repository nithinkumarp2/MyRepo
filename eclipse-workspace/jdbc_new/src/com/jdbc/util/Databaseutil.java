package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseutil {

	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/jdbc_db";
	private static final String username="root";
	private static final String psw="root";
	
	public Databaseutil() {
		try {
			Class.forName(DRIVER_PATH);
		} catch ( Exception e) {
			 System.out.println("something went wrong  "+e);
		}
	}// end constructor
	
	public static Connection getConnection() throws SQLException {
       	return DriverManager.getConnection(url,username,psw);
	}//end of getConnection
}
