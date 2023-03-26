package com.example.temipj.repository;

import com.example.temipj.domain.employee.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findAllByOrderByCreatedAtDesc();

}
