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


import com.bestbright.onlie_course.dto.Level_materialDTO;

import com.bestbright.onlie_course.model.Level_material;
import com.bestbright.onlie_course.repository.LevelMaterialRepository;
import com.bestbright.onlie_course.repository.LevelRepository;
import com.bestbright.onlie_course.repository.QuestionRepository;
import com.bestbright.onlie_course.service.Level_materialService;

@Controller
public class LevelmaterialController {
	@Autowired
	private LevelRepository levelRepository;
	@Autowired
	private LevelMaterialRepository levelMaterialRepository;
	@Autowired
	private Level_materialService level_materialservice;
	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping("/create_levelmaterial")
	public String createLevelMaterial(Model model) {
		model.addAttribute("levelM",new Level_materialDTO());
		model.addAttribute("levelList", levelRepository.findAll());
		return "create_levelmaterial";
	}
	 
	@PostMapping("/save_levelmaterial")
	public String saveLevelmaterial(@ModelAttribute("levelM")Level_materialDTO dto,Model model) throws Exception {
		if(dto!=null) {
		level_materialservice.saveLevelmaterial(dto);
		model.addAttribute("levelmaterialList",levelMaterialRepository.findAll());
		return "level_material_List";
		}else {
			return "redirect:/create_levelmaterial" ;
		}
	}
	
	@GetMapping("/level_material_List")
	public String showMaterial(Model model) {
		model.addAttribute("levelmaterialList",levelMaterialRepository.findAll());
		return "level_material_List";
	}
	
	@RequestMapping("/levelM/{level_id}")
	public String showLevelmaterialByLevel(Model model, @PathVariable("level_id") Long id) {
		
		List<Level_material> levelMaterial =level_materialservice.getLevelmaterialByLevel(id); 
		model.addAttribute("levelmaterialList", levelMaterial);
		model.addAttribute("level_id", id);
		return "showLevel_Material";
	}
	
	@RequestMapping("/show/vedio/{vedioPath}")
	public String showVedio(Model model, @PathVariable("vedioPath") String type) {
		model.addAttribute("levelmaterial", level_materialservice.getLevelMaterialVideo(type));
		return "video";
		}
		@RequestMapping("/show/pdf/{pdfPath}")
		public String showPDF(Model model, @PathVariable("pdfPath") String type) {
			model.addAttribute("levelmaterial", level_materialservice.getLevelMaterialPdf(type));
			return "pdf";
		}
	
}
