package com.codedecode.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codedecode.entities.Citizen;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
	
	public List<Citizen> findByVaccinationCentre(Integer id);
	
	public Citizen save(Citizen c);
	
}
