package com.teacher.springbootweb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teacher.springbootweb.Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
