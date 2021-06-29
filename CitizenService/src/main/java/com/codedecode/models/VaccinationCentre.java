package com.codedecode.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationCentre {

	private int id;
	
	private String centreName;
	
	private String centreAddress;
	
	
}
