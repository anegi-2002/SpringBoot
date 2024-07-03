package com.ingenico.m360.testingproject.service;

import com.ingenico.m360.testingproject.entity.Department;
import com.ingenico.m360.testingproject.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department) throws DepartmentNotFoundException;

    Department getDepartmentByName(String name);
}
