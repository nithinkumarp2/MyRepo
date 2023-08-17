package com.jsp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jsp.Dto.Employee;

@Configuration
@ComponentScan(basePackages="com.jsp")
public class myconfig {
	@Bean
	public EntityManagerFactory create()
	{
		return Persistence.createEntityManagerFactory("nithin");
	}

}
