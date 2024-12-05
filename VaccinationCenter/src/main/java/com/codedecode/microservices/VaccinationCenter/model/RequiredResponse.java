package com.codedecode.microservices.VaccinationCenter.model;

import java.util.List;

import com.codedecode.microservices.VaccinationCenter.entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequiredResponse {
	
	private VaccinationCenter center;
	
	private List<Citizen> citizens;	
	
}
