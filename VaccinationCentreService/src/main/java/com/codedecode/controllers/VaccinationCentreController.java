package com.codedecode.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.codedecode.entities.VaccinationCentre;
import com.codedecode.models.Citizen;
import com.codedecode.models.VaccinationCitizenResponse;
import com.codedecode.repositories.VaccinationRepository;

@RestController
@RequestMapping("/vaccination")
public class VaccinationCentreController {

	@Autowired
	private VaccinationRepository vaccinationRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(path = "/vaccinationId/{id}")
	public ResponseEntity<VaccinationCitizenResponse> findCitizensByVaccinationId(@PathVariable Integer id){
		
		VaccinationCentre centre = vaccinationRepository.findById(id).get();
		
		List<Citizen> citizens = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/byId/"+id, List.class);
		
		VaccinationCitizenResponse response = new VaccinationCitizenResponse();
		response.setCentre(centre);
		response.setCitizens(citizens);
		
		return new ResponseEntity<VaccinationCitizenResponse>(response, HttpStatus.OK);
	}
}
