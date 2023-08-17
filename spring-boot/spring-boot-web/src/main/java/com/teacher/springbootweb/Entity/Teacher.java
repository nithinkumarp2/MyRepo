package com.teacher.springbootweb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private long phoneno;
	private String Dob;
	private String address;
	private String subject;
	private String userName;
	private String userPass;
	
	
	
	public Teacher(int id, String firstName, String lastName, long phoneno, String dob, String address, String subject,
			String userName, String userPass) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneno = phoneno;
		Dob = dob;
		this.address = address;
		this.subject = subject;
		this.userName = userName;
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Teacher() {
		
	}
	
	public Teacher(String firstName, String lastName, long phoneno, String dob, String address,String subject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneno = phoneno;
		Dob = dob;
		this.address = address;
		this.subject=subject;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
