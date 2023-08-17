package com.jsp.SpringBootcurdweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBootcurdweb.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
