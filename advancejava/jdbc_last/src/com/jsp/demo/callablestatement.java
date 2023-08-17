package com.jsp.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;
public class callablestatement {

	public static void main(String[] args) {
		
		 try {
			 
			 Properties properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");
			properties.load(fileInputStream);
			
			 DriverManager.registerDriver(new Driver());
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_last",properties);
			 CallableStatement callableStatement=connection.prepareCall(" call fist_code(?,?)");
		// callableStatement.setInt(1, 15);
			 callableStatement.setString(1, "nithin");
			// callableStatement.setInt(3, 22);
			 callableStatement.setLong(2, 998999999l);
			 
			 callableStatement.execute();
			 connection.close();
			 System.out.println("inserted data successfullt");
			 
			
		} catch (IOException | SQLException e) {
			 
			e.printStackTrace();
		}
	}

}
