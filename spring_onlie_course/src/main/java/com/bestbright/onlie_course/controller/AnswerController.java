package com.bestbright.onlie_course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bestbright.onlie_course.dto.AnswerDTO;
import com.bestbright.onlie_course.dto.QuestionDTO;
import com.bestbright.onlie_course.dto.ResultDTO;
import com.bestbright.onlie_course.model.Answer;
import com.bestbright.onlie_course.model.Level_material;
import com.bestbright.onlie_course.repository.AnswerRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;
import com.bestbright.onlie_course.service.AnswerService;


@Controller
public class AnswerController {

	
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerService answerService;
	
	@GetMapping("/create_answer")
	public String createanswer(Model model) {
		model.addAttribute("answer", new AnswerDTO());
		model.addAttribute("questionlist",questionRepository.findAll());
		return "create_answer";
	}
	@PostMapping("/save_answer")
	public String saveanswer(@ModelAttribute("answer")AnswerDTO dto,Model model) throws Exception {
		if(dto!=null) {
			
			System.out.println(dto.getQuestion_id());
			System.out.println(dto.getAnswer_name());
			answerService.saveAnswer(dto);
		
		model.addAttribute("answerList",answerRepository.findAll());
		return "answerList";
		}else {
			return "redirect:/create_answer" ;
		}
	}
	
	
	
	@GetMapping("/answerList")
	public String showQuestion(Model model) {
		model.addAttribute("answerList",answerRepository.findAll());
		return "answerList";
	}
	

	@RequestMapping("/show/exam/{question_id}")
	public String showLevelmaterialByLevel(Model model, @PathVariable("question_id") Long id) {
	
		model.addAttribute("questionlist",questionRepository.findAll());
		List<Answer> answers =answerService.getAnswerByQuestion(id);
		model.addAttribute("answers", answers);
		model.addAttribute("question_id", id);
		model.addAttribute("result",new ResultDTO());
		return "Show_exam";
		
		
		
	}
}
