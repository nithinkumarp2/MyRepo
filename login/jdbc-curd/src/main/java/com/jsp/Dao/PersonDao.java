package com.jsp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.Dto.Person;

public class PersonDao {

	public static int rs;

	public Person SavePerson(Person person) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into Person values(?,?,?,?,?)");
			ps.setInt(1, person.getId());
			ps.setString(2, person.getName());
			ps.setInt(3, person.getAge());
			ps.setString(4, person.getEmail());
			ps.setString(5, person.getPassword());
			rs = ps.executeUpdate();
			con.close();
			return person;
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;

	}
	
	
	public Person UpdatePerson(Person person)  
	{
		try {
		//Person person=new Person();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		PreparedStatement ps = con.prepareStatement("update Person set name=?,age=?,email=?,password=? where id=?");
	
		ps.setString(1, person.getName());
		ps.setInt(2, person.getAge());
		ps.setString(3, person.getEmail());
		ps.setString(4, person.getPassword());
		ps.setInt(5, person.getId());
		rs = ps.executeUpdate();
		con.close();
		return person;
	} catch (ClassNotFoundException | SQLException e) {

		e.printStackTrace();
	}
	return null;
	}
	
	public Person DeletePerson(int id)
	{
		try {
			Person person=new Person();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
			PreparedStatement ps = con.prepareStatement("delete from person where id=?");
			ps.setInt(1, id);
			rs=ps.executeUpdate();
			return person;
			
		}catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
	public static ResultSet rs1;
	public List<Person> GetAllPerson()
	{
 		List<Person> list =new ArrayList<>();
		try {
			Person person=new Person();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from Person");
			 rs1=ps.executeQuery();
//			while (rs1.next()) {
//			 rs1.getInt(1);
//				 rs1.getString(2);
//				  rs1.getInt(3);
//				  rs1.getString(4);
//				 rs1.getString(5);
//				 System.out.println("heloo");
//				 list.add(person);
//			}
			return list;
		}catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;
	}
}
