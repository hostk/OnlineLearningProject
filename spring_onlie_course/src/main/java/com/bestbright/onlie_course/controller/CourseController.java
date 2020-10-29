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


import com.bestbright.onlie_course.dto.CourseDTO;
import com.bestbright.onlie_course.model.Level;
import com.bestbright.onlie_course.repository.CourseRepository;

import com.bestbright.onlie_course.service.CourseService;
import com.bestbright.onlie_course.service.LevelService;



@Controller

public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private CourseService courseService;
	@Autowired
	private LevelService levelService;
	
	@GetMapping("/create_course")
	public String createCourse(Model model) {
		model.addAttribute("course", new CourseDTO());
		return "create_course";
	}
	
	@PostMapping("/save_course")
	public String saveCourse(@ModelAttribute("course")CourseDTO coursedto,Model model) throws Exception {
		
		courseService.saveCourse(coursedto);
		model.addAttribute("courseList",courseRepository.findAll());
		return "redirect:/course_list";
	}
	
	
	@GetMapping("/")
	public String showCourse(Model model) {
		model.addAttribute("courseList",courseRepository.findAll());
		return "index";
	}
	
	
	
	@GetMapping("/course_list")
	public String showcourse(Model model) {
		model.addAttribute("courseList",courseRepository.findAll());
		return "course_list";
	}
//	@RequestMapping("/course/{id}")
//	public String courselist(@PathVariable("id") Long id,Model model) {
//		System.out.println(id);
//		model.addAttribute("course", levelRepository.getLevelListByCourse(id));
//		return "course_details";
//	}
//	

	
//	@GetMapping("/level/{course_id}")
//	public String showProductListByCategory(Model model,@RequestParam("course_id") Long id) {
//		//model.addAttribute("categories", productService.getCategoryList());
//		model.addAttribute("levellist", levelService.getLevellistbycourse(id));
//		return "course_details";
//	}
	
	@RequestMapping("/level/{course_id}")
	public String showLevelListByCourse(Model model, @PathVariable("course_id") Long id) {
		model.addAttribute("courseList",courseRepository.findAll());
		List<Level> levelList =levelService.getLevellistbycourse(id); 
		model.addAttribute("levels", levelList);
		model.addAttribute("course_id", id);
		return "course_details";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		courseService.delete(id);
		return "redirect:/course_list";
	}
	
}
