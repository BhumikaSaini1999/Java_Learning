package com.codedecode.microservices.repo;
import com.codedecode.microservices.entity.Citizen;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//Entity,Id
public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	
	//list of citizens corresponding to vaccinationCenterId
	public List<Citizen> findByVaccinationCenterId(Integer id);
}
