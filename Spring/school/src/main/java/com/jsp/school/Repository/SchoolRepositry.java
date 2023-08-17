package com.jsp.school.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.school.Dto.Teacher;

import jakarta.persistence.Id;

public interface SchoolRepositry extends JpaRepository<Teacher, Integer> {

	Teacher save(int id);

	//Teacher delete(Optional<Teacher> opt);

	 Teacher save(int id, Teacher teacher);

}
