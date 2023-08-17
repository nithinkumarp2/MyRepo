package com.jsp.demo;

import java.io.FileInputStream;
 
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
 
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class delete_callablestatement {

	public static void main(String[] args) {
		 
		
		
		try {
			
			Properties properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);
			
			DriverManager.deregisterDriver(new Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last",properties);
			CallableStatement  callableStatement=connection.prepareCall("call Dlt(?)");
			callableStatement.setString(1,"nithin");
		int rows= callableStatement.executeUpdate();
			
			  if (rows>0) {
					System.out.println( rows+" deleted successfully");
			}
			  else {
				  System.out.println("deletation failed");
			  }
		
			    
			
			
			
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
