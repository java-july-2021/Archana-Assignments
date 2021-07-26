package com.archana.assignments.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
@RequestMapping("/name")
	//public String page(Model model, @RequestParam(value="name", required=false, defaultValue="Human") String name) {
public String page(@PathVariable("name") String name, Model modelview) {
		modelview.addAttribute("name", name);
		
		return "index.jsp";
	}
	

	@RequestMapping(value="/telljokes", method=RequestMethod.POST)
	public String ShowPage(@RequestParam("tell") String tell,@RequestParam("joke") String joke,Model modelView) {
		
		
		modelView.addAttribute("tell" ,tell);
		modelView.addAttribute("joke", joke);
		
		
		return "showjoke.jsp";
	}
	
	

}
