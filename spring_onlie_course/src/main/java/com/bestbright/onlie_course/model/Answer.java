package com.bestbright.onlie_course.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Answer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long answer_id;
	private String answer_name;
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;
	

	
	@OneToOne(mappedBy="answer",cascade=CascadeType.ALL)
	private StudentResult studentResult;
	
	
	public Answer () {}
	
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
}
