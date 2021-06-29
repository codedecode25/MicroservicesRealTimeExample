package com.codedecode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	
	@RequestMapping("/citizenFallback")
	public ResponseEntity<String> citizenFallBackMethod(){
		String str = "Citizen service is down. Please come back after some time";
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
	
	@RequestMapping("/vaccinationFallback")
	public ResponseEntity<String> vaccinationFallBackMethod(){
		String str = "Vaccination service is down. Please come back after some time";
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
}
