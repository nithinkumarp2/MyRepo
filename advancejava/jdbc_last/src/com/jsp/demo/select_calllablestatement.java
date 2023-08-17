package com.jsp.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class select_calllablestatement {

	public static void main(String[] args) {
	 
		
		
		try {
			
			Properties properties= new Properties();
			FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);
			
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last",properties);
			CallableStatement callablestatement=connection.prepareCall("call slk()");
			
			ResultSet rs= 	callablestatement.executeQuery ();
		
		 if (rs.next()) {
			 System.out.println(rs.getString(1)+"  "+rs.getLong(2));
				System.err.println("selected successfully");
		} else {
                   System.out.println("selection failed");
		}
			
		 
		} catch (IOException | SQLException e) {
			 
			e.printStackTrace();
		}
		
		
		

	}

}
