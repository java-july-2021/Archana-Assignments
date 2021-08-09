package com.archana.languages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.archana.languages.model.Language;
import com.archana.languages.service.LanguageService;

@Controller
public class LanguageController {
	
	private final  LanguageService lService;
	public LanguageController(LanguageService service) {
	this.lService=service;
	}
// RequestMapping
	@GetMapping("/")
public String index(Model model, @ModelAttribute("language")Language language) {
		model.addAttribute("allLanguages", this.lService.allLanguages());
	
	return "index.jsp";
	}
	

	
	
}