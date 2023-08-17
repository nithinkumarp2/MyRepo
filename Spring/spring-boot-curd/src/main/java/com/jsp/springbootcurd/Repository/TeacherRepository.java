package com.jsp.springbootcurd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcurd.Dto.Teacher;

public interface TeacherRepository extends JpaRepository< Teacher, Integer> {

}
