package com.archana.languages.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.archana.languages.model.Language;
import com.archana.languages.repository.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		
		this.lRepo=repo;
		
	}
	//Find all languaes
	public List<Language> allLanguages() {
		return this.lRepo.findAll();
	}
	//Find one language
	public Language findLanguage(Long Id) {
		
		return this.lRepo.findById(Id).orElse(null);
	}
	//create 
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	//update
	public Language updateLanguage(Language updateLanguage) {

		return this.lRepo.save(updateLanguage);
	}
	
	// Delete
	public void deleteLanguage(Long Id) {
		this.lRepo.deleteById(Id);
		
		
	}
}
