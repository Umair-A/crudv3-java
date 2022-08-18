package com.example.crudv3.repositary;

import com.example.crudv3.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositary extends JpaRepository<Department , Long> {
}
