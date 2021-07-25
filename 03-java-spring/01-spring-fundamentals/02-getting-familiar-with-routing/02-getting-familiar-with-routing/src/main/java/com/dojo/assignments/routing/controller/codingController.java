package com.dojo.assignments.routing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class codingController {
	
	@RequestMapping("/codig")
	public String greeting() {
		
		return "Hello Coding Dojo";
	}
	
	@RequestMapping("/coding/python")
	public String codingPython() {
		
		return "'Python/Django was awesome!'";
	}
	
	@RequestMapping("/coding/java")
	
	public String codingJava() {
		
		return "'Java/Spring is better!'.";
	
	
	
	}
	}
