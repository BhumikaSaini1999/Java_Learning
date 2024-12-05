package com.codedecocde.CRUDExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codedecocde.CRUDExample.entity.Employee;

@Repository
public interface EmployeeCrudRepository extends JpaRepository<Employee, Long>{

}
