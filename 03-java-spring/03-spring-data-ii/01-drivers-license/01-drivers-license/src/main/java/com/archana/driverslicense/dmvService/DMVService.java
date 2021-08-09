package com.archana.driverslicense.dmvService;

import java.util.List;

import com.archana.driverslicense.model.License;
import com.archana.driverslicense.model.Person;
import com.archana.driverslicense.repository.LicenseRepository;
import com.archana.driverslicense.repository.PersonRepository;

public class DMVService {
	
	private final PersonRepository pRepo;
	private final LicenseRepository lRepo;
	public DMVService(PersonRepository pRepo, LicenseRepository lRepo) {
		this.pRepo = pRepo;
		this.lRepo = lRepo;
	}
	public Person createPerson(Person p) {
		return this.pRepo.save(p);
	}
	public Person getPerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return this.pRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return this.pRepo.findByLicenseIdIsNull();
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = lRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}

}
