package com.jsp.service;

import java.util.List;

import com.jsp.Dao.PersonDao;
import com.jsp.Dto.Person;

public class PersonService {

	PersonDao dao=new PersonDao();
	public Person SavePerson(Person person)
	{
		return dao.SavePerson(person);
	}
	
	public Person UpdatePerson(Person person)
	{
		return dao.UpdatePerson(person);
	}
	
	public Person DeletePerson(int id)
	{
		return dao.DeletePerson(id);
	}
	
	public List<Person> GetAllPerson()
	{
		return dao.GetAllPerson();
	}
}
