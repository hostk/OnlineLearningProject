package com.bestbright.onlie_course.dto;

import java.io.Serializable;


public class LevelDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long level_id;
	private String level_name;

	public LevelDTO() {}
	
	public Long getLevel_id() {
		return level_id;
	}
	public void setLevel_id(Long level_id) {
		this.level_id = level_id;
	}
	public String getLevel_name() {
		return level_name;
	}
	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}
	
}
