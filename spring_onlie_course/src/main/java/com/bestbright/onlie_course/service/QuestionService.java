package com.bestbright.onlie_course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbright.onlie_course.dto.LevelDTO;
import com.bestbright.onlie_course.dto.QuestionDTO;
import com.bestbright.onlie_course.model.Level;
import com.bestbright.onlie_course.model.Level_material;
import com.bestbright.onlie_course.model.Question;
import com.bestbright.onlie_course.repository.LevelMaterialRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;

@Service
public class QuestionService implements  QuestionInterface{
@Autowired
private QuestionRepository questionRepository;
@Autowired
private LevelMaterialRepository levelMaterialRepository;
	
	@Override
	public void saveQuestion(QuestionDTO questiondto) {
		// TODO Auto-generated method stub

		Level_material ml=levelMaterialRepository.findById(questiondto.getLevel_material_id()).get();
		Question que=new Question();
		
		que.setQuestion_name(questiondto.getQuestion_name());
		que.setLevel_material(ml);
		questionRepository.save(que);
	}
	
}
