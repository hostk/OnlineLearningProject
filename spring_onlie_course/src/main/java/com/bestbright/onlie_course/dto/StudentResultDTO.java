package com.bestbright.onlie_course.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StudentResultDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentResult_id;
	
	private boolean status;
	
	private Long student_id;
	private Long question_id;
	private Long answer_id;
	
	public Long getStudentResult_id() {
		return studentResult_id;
	}
	public void setStudentResult_id(Long studentResult_id) {
		this.studentResult_id = studentResult_id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
