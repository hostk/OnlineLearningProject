package com.bestbright.onlie_course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bestbright.onlie_course.dto.LevelDTO;

import com.bestbright.onlie_course.model.Level;
import com.bestbright.onlie_course.repository.LevelRepository;


@Service
public class LevelService implements LevelInterface{
@Autowired
	private LevelRepository levelRepository;
	@Override
	public void saveLevel(LevelDTO leveldto) {
		// TODO Auto-generated method stub
		levelRepository.save(convertLevel(leveldto));
		
	}
	Level convertLevel(LevelDTO leveldto) {
		Level lev=new Level();
		lev.setLevel_name(leveldto.getLevel_name());
		return lev;
	}
	@Override
	public List<Level> getLevellistbycourse(Long course_id) {
		// TODO Auto-generated method stub
		return  levelRepository.getLevelListByCourse(course_id);
	}
	
	
	
	

}
