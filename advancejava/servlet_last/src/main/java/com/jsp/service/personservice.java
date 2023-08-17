package com.jsp.service;

import java.util.List;

import com.jsp.dao.persondao;
import com.jsp.dto.person;

public class personservice {
     persondao dao=new persondao();
     
     public person personsave(person person) {
		return dao.personsave(person);
	}
     
     public person personupdate(person person) {
		return dao.personupdate(person);
    	 
     }
     
     public int persondelete(int id)
     {
		return dao.persondelete(id);
    	 
     }
     
     public List<person> getAllPerson()
     {
		return dao.getAllPerson();
    	 
     }
     public List<person> getPersonById(int id)
     {
		return dao.getPersonById(id);
    	 
     }
}
