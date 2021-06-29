/**
 * 
 */
package com.codedecode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.entities.Citizen;
import com.codedecode.models.SendResponse;
import com.codedecode.repositories.CitizenRepository;

/**
 * @author Codedecode
 *
 */

@RestController
@RequestMapping("/citizen")
public class CitizenController {

	@Autowired
	private CitizenRepository citizenRepository;
	
	
	@RequestMapping(path = "/byId/{id}")
	public ResponseEntity<List<Citizen>> findById(@PathVariable Integer id){
		
		List<Citizen> citizens = citizenRepository.findByVaccinationCentre(id);
		return new ResponseEntity<List<Citizen>>(citizens,HttpStatus.ACCEPTED);
		
	}
	
	
	
}
