package com.employeejpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeejpa.model.Employee;
import com.employeejpa.respository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository er;
	
	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees(){
		return (List<Employee>)er.findAll();
	}

	@RequestMapping(value="/employees/{id}", method = RequestMethod.GET)
	public Optional<Employee> getEmployees(Long id){
		return er.findById(id);
	}
	
	@RequestMapping(value="/employees", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee){
			er.save(employee);
		return employee;
	}	
	
}
