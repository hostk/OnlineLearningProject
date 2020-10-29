package com.bestbright.onlie_course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	private AnswerRepository answerRespository;
	
	@Autowired
	private StudentResultRepository studentResultRepository;
	
	
	@Override
	public void saveResult(StudentResultDTO studentResultdto) {
		// TODO Auto-generated method stub
		
		Question que=questionRepository.findById(studentResultdto.getQuestion_id()).get();
		Answer ans=answerRespository.findById(studentResultdto.getAnswer_id()).get();
		
		StudentResult stresult=new StudentResult();

		stresult.setQuestion(que);
		stresult.setAnswer(ans);
		studentResultRepository.save(stresult);
		
	}

}
