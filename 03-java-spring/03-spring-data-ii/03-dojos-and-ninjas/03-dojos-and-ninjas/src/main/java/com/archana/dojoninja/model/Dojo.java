package com.archana.dojoninja.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;



@Entity
@Table(name="dojos")
public class Dojo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long Id;
	private String name;
	@Column(updatable=false)
	protected Date createdAt;
	protected Date updatedAt;
	
	@OneToMany(mappedBy="dojo" ,cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Ninja>ninjas;
	
	@PrePersist
	protected void onCreate() {
	this.createdAt=new Date();
	
}

	@PrePersist
	protected void onUpdate() {
	this.updatedAt=new Date();
	
}

	public Dojo() {
		
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}

	


}
