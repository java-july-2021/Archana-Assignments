package com.archana.driverslicense.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.archana.driverslicense.model.License;

@Repository
public interface LicenseRepository extends CrudRepository {
	List<License> findAll();
	public License findTopByOrderByNumberDesc();

}
