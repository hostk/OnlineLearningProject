package com.bestbright.onlie_course.service;

import java.util.List;

import com.bestbright.onlie_course.dto.LevelDTO;
import com.bestbright.onlie_course.model.Level;

public interface LevelInterface {
	void saveLevel(LevelDTO leveldto);

	public List<Level> getLevellistbycourse(Long course_id);
}
