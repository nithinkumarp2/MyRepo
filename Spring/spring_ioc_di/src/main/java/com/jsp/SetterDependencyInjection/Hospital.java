package com.jsp.SetterDependencyInjection;

public class Hospital {
	private int id;
	private String name;
	private String address;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("id : "+ id);
		System.out.println("name : "+name);
		System.out.println("aadress : "+address);
	}

}
