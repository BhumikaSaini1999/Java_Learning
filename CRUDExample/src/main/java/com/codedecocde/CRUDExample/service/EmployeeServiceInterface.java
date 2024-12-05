package com.codedecocde.CRUDExample.service;

import java.util.List;

import com.codedecocde.CRUDExample.entity.Employee;

public interface EmployeeServiceInterface{

	Employee addEmployee(Employee emp);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long empId);

	void deleteEmployeeById(Long empId);

}
