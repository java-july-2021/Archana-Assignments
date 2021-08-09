package com.archana.dojoninja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archana.dojoninja.model.Ninja;
import com.archana.dojoninja.service.AppService;

@Controller
@RequestMapping
public class NinjaController {
	
	private AppService aService;
	public NinjaController(AppService service) {
		this.aService = service;
	}
	@GetMapping("/new")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.aService.AllDojos());
		return "newninja.jsp";
	}
	@PostMapping("/createNinja")
	public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.aService.AllDojos());
			return "newninja.jsp";
		}
		this.aService.createNinja(ninja);
		return "redirect:/dojo/new";
	}

}
