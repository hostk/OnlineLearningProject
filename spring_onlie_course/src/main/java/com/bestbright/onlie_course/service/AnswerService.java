package com.bestbright.onlie_course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbright.onlie_course.dto.AnswerDTO;

import com.bestbright.onlie_course.model.Answer;
import com.bestbright.onlie_course.model.Question;
import com.bestbright.onlie_course.repository.AnswerRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;
@Service
public class AnswerService implements AnswerInterface{
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Override
	public void saveAnswer(AnswerDTO answerdto) {
		// TODO Auto-generated method stub
		Question que=questionRepository.findById(answerdto.getQuestion_id()).get();
		Answer ans=new Answer();
		ans.setAnswer_name(answerdto.getAnswer_name());
		ans.setStatus(answerdto.isStatus());
		ans.setQuestion(que);
		answerRepository.save(ans);
	}
	@Override
	public List<Answer> getAnswerByQuestion(Long question_id) {
		// TODO Auto-generated method stub
		return answerRepository.getAnswerByQuestion(question_id);
	}

	
}
