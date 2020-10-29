package com.bestbright.onlie_course.service;

import java.util.List;

import com.bestbright.onlie_course.dto.AnswerDTO;
import com.bestbright.onlie_course.model.Answer;


public interface AnswerInterface {

	void saveAnswer(AnswerDTO answerdto);
	public List<Answer> getAnswerByQuestion(Long question_id);
}
