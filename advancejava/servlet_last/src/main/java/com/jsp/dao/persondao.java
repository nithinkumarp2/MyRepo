package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.person;

public class persondao {

public person personsave(person person) {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into persondetails values(?,?,?,?,?");
			preparedStatement.setInt(1,person.getId() );
			preparedStatement.setString(2, person.getName());
			preparedStatement.setInt(3, person.getAge());
			preparedStatement.setString(4, person.getEmail());
			preparedStatement.setString(5, person.getPassword());
			int rows=preparedStatement.executeUpdate();
			while (rows>0) {
			 return person;
			}
			connection.close();
		}	
		 catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
}


public person personupdate(person person)
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("update persondetails set id=?, name=?,age=?,email=?,password=? where id=?");
		preparedStatement.setInt(1, person.getId());
		preparedStatement.setString(2, person.getName());
		preparedStatement.setInt(3, person.getAge());
		preparedStatement.setString(3, person.getEmail());
		preparedStatement.setString(5, person.getPassword());
		preparedStatement.setInt(6, person.getId());
		int rows=preparedStatement.executeUpdate();
		if (rows>0) {
			 return person;
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	return null;
}


public int persondelete(int id)
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("delete from persondetails where id=?");
		preparedStatement.setInt(1, id);
		int rows=preparedStatement.executeUpdate();
		
		return rows;
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
}

public List<person> getAllPerson() {
	  List<person> list = new ArrayList<person>();
	  try {
	   Class.forName("com.mysql.cj.jdbc.Driver");

	   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first", "root",
	     "root");

	   Statement statement = connection.createStatement();

	   ResultSet resultSet = statement.executeQuery("select * from persondeatils");
	   while (resultSet.next()) {
		   person person = new person();
	    person.setId(resultSet.getInt(1));
	    person.setName(resultSet.getString(2));
	    person.setAge(resultSet.getInt(3));
	    person.setEmail(resultSet.getString(4));
	    person.setPassword(resultSet.getString(5));

	    list.add(person);
	   }

	   connection.close();
	  } catch (ClassNotFoundException | SQLException e) {
	   e.printStackTrace();
	  }
	  return list;
	 }


public List<person> getPersonById(int id)  {
	  List<person> list = new ArrayList<person>();
	  try {
	   Class.forName("com.mysql.cj.jdbc.Driver");

	   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_first", "root",
	     "root");

	   PreparedStatement preparedStatement = connection.prepareStatement("select * from person where id =?");

	   preparedStatement.setInt(1, id);

	   ResultSet resultSet = preparedStatement.executeQuery();
	   while (resultSet.next()) {
		   person person = new person();
	    person.setId(resultSet.getInt(1));
	    person.setName(resultSet.getString(2));
	    person.setAge(resultSet.getInt(3));
	    person.setEmail(resultSet.getString(4));
	    person.setPassword(resultSet.getString(5));

	    list.add(person);
	   }

	   connection.close();
	  } catch (ClassNotFoundException | SQLException e) {
	   e.printStackTrace();
	  }
	  return list;
	 }



}

