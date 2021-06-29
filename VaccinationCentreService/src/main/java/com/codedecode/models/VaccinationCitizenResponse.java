package com.codedecode.models;

import java.util.List;

import com.codedecode.entities.VaccinationCentre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationCitizenResponse {

	private VaccinationCentre centre;
	
	private List<Citizen> citizens;
	
}
