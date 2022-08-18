package com.example.crudv3.service;

import com.example.crudv3.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department , Long departmentID);

    Void deleteDepartmentById(Long departmentById);
}
