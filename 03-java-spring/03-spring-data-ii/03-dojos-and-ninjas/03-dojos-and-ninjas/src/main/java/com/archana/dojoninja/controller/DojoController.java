package com.archana.dojoninja.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archana.dojoninja.model.Dojo;
import com.archana.dojoninja.service.AppService;

@Controller
@RequestMapping("/dojo")
public class DojoController {
	
	@Autowired
	private AppService aService;
	
	@GetMapping("/new")
	public String createDojo(@ModelAttribute ("dojo") Dojo dojo) {
		
		return "newDojo.jsp";
		
	}
	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute ("dojo") Dojo dojo,BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		this.aService.createDoJo(dojo);
			
		return "redirect:/ninja/new";	
		
	}
	@GetMapping("/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.aService.getOneDojo(id));
		return "dojodetail.jsp";
	}
		
	

}
