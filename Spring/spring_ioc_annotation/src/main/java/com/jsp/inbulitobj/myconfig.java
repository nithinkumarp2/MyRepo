package com.jsp.inbulitobj;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class myconfig {
@Bean
public EntityManagerFactory create()
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("nithin");
	return emf;
}
}
