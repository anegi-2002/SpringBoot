package com.ingenico.m360.testingproject.service;

import com.ingenico.m360.testingproject.entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {

  /*  @Test
    void saveDepartment() {
    }

    @Test
    void getAllDepartments() {
    }

    @Test
    void getDepartmentById() {
    }

    @Test
    void deleteDepartmentById() {
    }

    @Test
    void updateDepartment() {
    }*/

    @Autowired
    private DepartmentService departmentService;

    @Test
    void getDepartmentByName() {
        String departmentname = "IT";
        Department department = departmentService.getDepartmentByName(departmentname);
    }
}