package com.employeejpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeejpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
