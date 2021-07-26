package com.archana.assignments.controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dateController {
	
	private Date getDate() {
		Date now = new Date();
		return now;
	}
	
	
	@RequestMapping("/")
	public String frontEnd() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model modelview) {
		LocalDateTime day = LocalDateTime.now();
		modelview.addAttribute("date", day);
		return "date.jsp";
	}

	
	@RequestMapping("/time") 
	public String time(Model viewModel) {
	viewModel.addAttribute("datetime", getDate());
		return "time.jsp";
}
}
