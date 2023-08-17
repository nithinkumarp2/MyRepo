package com.jsp.SpringBootcurdweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jsp.SpringBootcurdweb.Entity.Student;
import com.jsp.SpringBootcurdweb.Repository.StudentRepository;

@SpringBootApplication
public class SpringBootCurdWebApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurdWebApplication.class, args);
	}

	@Autowired
	private StudentRepository repository;
	@Override
	public void run(String... args) throws Exception {
//		 Student student1=new Student("nithin","kuamr","nithin@gmail.com");
//		 repository.save(student1);
//		 Student student2=new Student("nithin","kuamr","nithin@gmail.com");
//		 repository.save(student1);
		 
	}

}
