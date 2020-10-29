package com.bestbright.onlie_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bestbright.onlie_course.model.Answer;
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
	@Query("SELECT a from Answer a  where a.question.question_id=:questionId")
	public List<Answer> getAnswerByQuestion(@Param("questionId")Long id);
}