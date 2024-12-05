package com.codedecode.microservices.VaccinationCenter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codedecode.microservices.VaccinationCenter.entity.VaccinationCenter;

public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer>{

	public VaccinationCenter findVaccinationCenterById(Integer id);
}
