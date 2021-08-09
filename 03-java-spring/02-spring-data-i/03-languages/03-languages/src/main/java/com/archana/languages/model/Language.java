package com.archana.languages.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="languages")
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Size (min=2, max=20)
	private String name;
	
	@Size (min=2, max=20)
	private String creator;
	
	@NotNull
	private long currentVersion;
	
	public Language() {
		
	}

	public Language(String name, String creator, long currentVersion) {
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public long getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(long currentVersion) {
		this.currentVersion = currentVersion;
	}

	
	


	
	
}

