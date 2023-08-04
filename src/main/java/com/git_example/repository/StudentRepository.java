package com.git_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git_example.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
