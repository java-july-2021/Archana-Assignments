package com.archana.dojoninja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archana.dojoninja.model.Dojo;
import com.archana.dojoninja.model.Ninja;
import com.archana.dojoninja.repository.DojoRepository;
import com.archana.dojoninja.repository.NinjaRepository;

@Service
public class AppService {
	@Autowired
	private NinjaRepository nRepo;
	@Autowired
	private DojoRepository dRepo;
	
	public List<Dojo> AllDojos() {
		
		return  this.dRepo.findAll();
		
	}
	public Dojo createDoJo(Dojo dojo) {
		return this.dRepo.save(dojo);
	
	}
	public Dojo createDoJo(Ninja ninja) {
		return this.nRepo.save(ninja);
	
	}
	public Dojo getOneDojo(Long Id) {
		
		return this.findById(Id).oRElse(null);
		
	}
	

}
