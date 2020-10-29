package com.bestbright.onlie_course.service;

import com.bestbright.onlie_course.dto.CourseDTO;
import com.bestbright.onlie_course.model.Course;

public interface CourseInterface {
	void saveCourse(CourseDTO coursedto)throws Exception;

	
	public Course getcourseById(Long id);
	void delete(Long id);
}
