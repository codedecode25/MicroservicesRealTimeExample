package com.codedecode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codedecode.entities.VaccinationCentre;

@Repository
public interface VaccinationRepository extends JpaRepository<VaccinationCentre, Integer>{

	
}
