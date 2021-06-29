package com.codedecode.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {

	private int id;

	private String citizenName;

	private String citizenAddress;

	private String doseType;

}
