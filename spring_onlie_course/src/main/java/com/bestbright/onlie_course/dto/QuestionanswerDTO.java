package com.bestbright.onlie_course.dto;

import java.io.Serializable;

public class QuestionanswerDTO implements Serializable {
	private Long question_id;
	private Long answer_id;

	
	public Long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
	public Long getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(Long answer_id) {
		this.answer_id = answer_id;
	}
}
