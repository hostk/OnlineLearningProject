package com.bestbright.onlie_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bestbright.onlie_course.model.StudentResult;
@Repository
public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
 
 
}
