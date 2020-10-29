package com.bestbright.onlie_course.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long question_id;
	private String question_name;
	
	
	
	@ManyToOne
	@JoinColumn(name="level_material_id")
	private Level_material level_material;
	
	
	@OneToMany(mappedBy = "question")
	private Set<Answer> answers;
	
//	@OneToOne
//	private StudentResult studentResults;
	
	@OneToOne(mappedBy="question",cascade=CascadeType.ALL)
	private StudentResult studentResult;
	
	public Question() {
		
	}
	
	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_name() {
		return question_name;
	}

	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}

	
	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public Level_material getLevel_material() {
		return level_material;
	}

	public void setLevel_material(Level_material level_material) {
		this.level_material = level_material;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public StudentResult getStudentResult() {
		return studentResult;
	}

	public void setStudentResult(StudentResult studentResult) {
		this.studentResult = studentResult;
	}
	

}
