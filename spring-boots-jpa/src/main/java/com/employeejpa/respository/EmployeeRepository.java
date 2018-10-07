package com.employeejpa.respository;

import org.springframework.data.repository.CrudRepository;

import com.employeejpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
