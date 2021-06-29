package com.codedecode.models;

import java.util.List;

import com.codedecode.entities.Citizen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendResponse {

	private List<Citizen> citizens;
}
