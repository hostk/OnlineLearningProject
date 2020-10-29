package com.bestbright.onlie_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bestbright.onlie_course.model.Level;
@Repository
public interface LevelRepository extends JpaRepository<Level,Long>{

	@Query("SELECT l from Level l LEFT JOIN Course c on l.course.course_id=c.course_id where l.course.course_id=:courseId")
	public List<Level> getLevelListByCourse(@Param("courseId")Long id);
}
