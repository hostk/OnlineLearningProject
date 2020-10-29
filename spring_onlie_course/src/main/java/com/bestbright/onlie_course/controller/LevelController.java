package com.bestbright.onlie_course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bestbright.onlie_course.model.Level;
import com.bestbright.onlie_course.repository.CourseRepository;
import com.bestbright.onlie_course.repository.LevelRepository;

@Controller
public class LevelController {

	@Autowired
	private LevelRepository levelRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/create_level")
	public String createLevel(Model model) {
		model.addAttribute("level", new Level());
		model.addAttribute("courseList",courseRepository.findAll());
		return "create_level";
	}
	@PostMapping("/save_level")
	public String saveLevel(@ModelAttribute("level")Level level,Model model) {
		
		levelRepository.save(level);
		
		model.addAttribute("levelList",levelRepository.findAll());
		
		return "redirect:/level_list";
	}
	
	@GetMapping("/level_list")
	public String showlevel(Model model) {
		model.addAttribute("levelList",levelRepository.findAll());
		return "level_list";
	}
}
