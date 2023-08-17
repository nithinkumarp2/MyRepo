package com.jsp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class update_callableStatement {

	public static void main(String[] args) {
		 
		
		try {
			
			Properties properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last",properties);
			CallableStatement callableStatement=connection.prepareCall("call upd(?,?,?)");
			callableStatement.setString(1, "kumar");
			callableStatement.setLong(2, 8247873284l);
			callableStatement.setString(3, "pppp");
			
			int rows=callableStatement.executeUpdate();
			
			if (rows>0) {
				System.out.println(rows+" updated successfully");
			} else {
				System.err.println("updatation failed");
 
			}
			connection.close();
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
