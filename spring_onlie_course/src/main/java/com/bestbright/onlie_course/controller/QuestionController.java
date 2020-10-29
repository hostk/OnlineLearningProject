package com.bestbright.onlie_course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bestbright.onlie_course.dto.Level_materialDTO;
import com.bestbright.onlie_course.dto.QuestionDTO;
import com.bestbright.onlie_course.repository.LevelMaterialRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;
import com.bestbright.onlie_course.service.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private LevelMaterialRepository levelMaterialRepository;
	@Autowired
	private QuestionService questionService;
	@GetMapping("/create_question")
	public String createQuestion(Model model) {
		model.addAttribute("question", new QuestionDTO());
		model.addAttribute("levelmaterialList",levelMaterialRepository.findAll());
		return "create_question";
	}
	@PostMapping("/save_question")
	public String saveQuestion(@ModelAttribute("question")QuestionDTO dto,Model model) throws Exception {
		if(dto!=null) {
			questionService.saveQuestion(dto);
		
		model.addAttribute("questionlist",questionRepository.findAll());
		return "question_list";
		}else {
			return "redirect:/create_question" ;
		}
	}
	
	
	@GetMapping("/question_list")
	public String showQuestion(Model model) {
		model.addAttribute("questionlist",questionRepository.findAll());
		return "question_list";
	}
	
}


