package com.archana.driverslicense.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archana.driverslicense.model.Person;

@Repository
public interface PersonRepository extends CrudRepository {
	
	List<Person> findAll();
	List<Person> findByLicenseIdIsNull();

}
