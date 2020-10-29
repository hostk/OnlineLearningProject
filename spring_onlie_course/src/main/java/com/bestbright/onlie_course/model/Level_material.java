package com.bestbright.onlie_course.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class Level_material implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long level_material_id;
	private String name;
	private String type;
	private String vedioPath;
	private String pdfPath;
	
	@ManyToOne
	@JoinColumn(name="level_id")
	private Level level;
	
	//@OneToOne(mappedBy="questions",cascade=CascadeType.ALL)
	//private Level_material level_material;
	
	
	@OneToMany(mappedBy="level_material",cascade=CascadeType.ALL)
	private List<Question> questions = new ArrayList<Question>();
	
	public Level_material() {}
	
	

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}



	

	

	public Long getLevel_material_id() {
		return level_material_id;
	}



	public void setLevel_material_id(Long level_material_id) {
		this.level_material_id = level_material_id;
	}



	

	


	public List<Question> getQuestions() {
		return questions;
	}



	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}



	public String getVedioPath() {
		return vedioPath;
	}



	public void setVedioPath(String vedioPath) {
		this.vedioPath = vedioPath;
	}



	public String getPdfPath() {
		return pdfPath;
	}



	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}



	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
}