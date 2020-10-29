package com.bestbright.onlie_course.dto;

import java.io.Serializable;

import com.bestbright.onlie_course.model.Question;

public class AnswerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long answer_id;
	private String answer_name;
	private boolean status;
	private Long question_id;
	
	public AnswerDTO() {}
	
	public Long getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(Long answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer_name() {
		return answer_name;
	}
	public void setAnswer_name(String answer_name) {
		this.answer_name = answer_name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	
}
