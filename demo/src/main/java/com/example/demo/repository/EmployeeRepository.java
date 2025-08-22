package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Employee;

// JpaRepository provides built-in CRUD methods (save, findAll, findById, deleteById, etc.)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
