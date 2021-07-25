package com.dojo.assignments.routing.dojoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dojoController{
	
	
	
	@RequestMapping("/{coding}")
	public String hello(@PathVariable("coding") String coding){
		if("coding".equals(coding)) {
			return "Dojo is awesome";
		}
		
			return "Dojo is not awesome";
	}
	
	
	@RequestMapping("/{dojo}/{burbank}")
	public String hello(@PathVariable String dojo, String burbank){
		if("dojo".equals(dojo)&& "burbank".equals(burbank)) {
			return "'Burbank Dojo is located in Southern California";
		}
		
			return "'Burbank Dojo is not located in Southern California";
	
	} 
	
	@RequestMapping("/{dojo}/{san-jose}")
	public String helloow(@PathVariable String dojo, String san-jose){
		if("dojo".equals(dojo)&& "san-jose".equals(san-jose)) {
			
			return "SJ dojo is the headquarters";
		}
		
			return "SJ dojo is not  the headquarters";
	
	} 
	
	
	

}
//end class dojoController
