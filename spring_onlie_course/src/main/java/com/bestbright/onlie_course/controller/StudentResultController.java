package com.bestbright.onlie_course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bestbright.onlie_course.dto.QuestionDTO;
import com.bestbright.onlie_course.dto.StudentResultDTO;
import com.bestbright.onlie_course.repository.AnswerRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;
import com.bestbright.onlie_course.repository.StudentResultRepository;
import com.bestbright.onlie_course.service.StudentResultService;

@Controller


public class StudentResultController {

	@Autowired
	private StudentResultRepository studentResultRepository;
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private StudentResultService studentResultService;
	@GetMapping("/create_result")
	public String createresult(Model model) {
		model.addAttribute("result", new StudentResultDTO());
		model.addAttribute("questionlist",questionRepository.findAll());
		model.addAttribute("answers",answerRepository.findAll());
		return "Show_exam";
	}
	
	
	@PostMapping("/save_result")
	public String saveresult(@ModelAttribute("result")StudentResultDTO dto,Model model) throws Exception {
		if(dto!=null) {
			
			studentResultService.saveResult(dto);
		
		model.addAttribute("resultList",questionRepository.findAll());
		return "result_list";
		}else {
			return "redirect:/create_result" ;
		}
	}
}
