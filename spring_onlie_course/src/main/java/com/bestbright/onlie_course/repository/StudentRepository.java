package com.bestbright.onlie_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bestbright.onlie_course.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
