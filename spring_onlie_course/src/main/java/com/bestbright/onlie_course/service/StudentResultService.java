package com.bestbright.onlie_course.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbright.onlie_course.dto.QuestionanswerDTO;
import com.bestbright.onlie_course.dto.ResultDTO;
import com.bestbright.onlie_course.dto.StudentResultDTO;
import com.bestbright.onlie_course.model.Answer;
import com.bestbright.onlie_course.model.Question;
import com.bestbright.onlie_course.model.StudentResult;
import com.bestbright.onlie_course.repository.AnswerRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;
import com.bestbright.onlie_course.repository.StudentResultRepository;

@Service
public class StudentResultService implements StudentResultInterface {

	@Autowired
	private QuestionRepository questionRepository;
	
	
	@Autowired
	private StudentResultRepository studentResultRepository;

	@Autowired
	private AnswerRepository answerRepository;
	
	
	
	@Override
	public void saveResult(ResultDTO resultDTO) {
		// TODO Auto-generated method stub
		
		
		List<StudentResult> resultList=resultDTO.getResultList().stream().map(s->{
			StudentResult stresult=new StudentResult();
			if(s.getQuestion_id()!=null) {
				Question quest = questionRepository.getOne(s.getQuestion_id());
			stresult.setQuestion(quest);
			if(s.getAnswer_id()!=null) {
				Answer ans= answerRepository.getOne(s.getAnswer_id());
			
				stresult.setAnswer(ans);
				stresult.setMark(ans.isStatus()?5:0);
				stresult.setStatus(ans.isStatus());
				}
			}
			
			
			return stresult;
		}).collect(Collectors.toList());
		
			
			
			studentResultRepository.saveAll(resultList);
		}
				
	




	

	
	
}
