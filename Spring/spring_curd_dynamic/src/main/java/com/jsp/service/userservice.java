package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Dao.UserDao;
import com.jsp.Dto.user;

@Component
public class userservice {
@Autowired
	UserDao dao;
	public user save(user user)
	{
		return dao.save(user);
	}
	
	public user update(user user)
	{
		return dao.update(user);
	}
	
	public user delete(user user)
	{
		return dao.delete(user);
	}
	
	public List<user> getAll(user user)
	{
		return dao.getAll(user);
	}
}
