package com.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
}
