package com.example.crudv3.service;

import com.example.crudv3.entity.Department;
import com.example.crudv3.repositary.DepartmentRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepositary departmentRepositary;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepositary.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList()
    {
        return (List<Department>)
                departmentRepositary.findAll();
    }
    @Override
    public Department
    updateDepartment(Department department , Long departmentID){
        Department depDB = departmentRepositary.findById(departmentID).get();
        if (Objects.nonNull(department.getDepartmentName())
                && !"".equalsIgnoreCase(
                department.getDepartmentName())) {
            depDB.setDepartmentName(
                    department.getDepartmentName());
        }
        if (Objects.nonNull(
                department.getDepartmentAddress())
                && !"".equalsIgnoreCase(
                department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(
                    department.getDepartmentAddress());
        }
        if (Objects.nonNull(department.getDepartmentCode())
                && !"".equalsIgnoreCase(
                department.getDepartmentCode())) {
            depDB.setDepartmentCode(
                    department.getDepartmentCode());
        }
        return departmentRepositary.save(depDB);
    }
    @Override
    public Void deleteDepartmentById(Long departmentId)
    {
        departmentRepositary.deleteById(departmentId);
        return null;
    }
}
