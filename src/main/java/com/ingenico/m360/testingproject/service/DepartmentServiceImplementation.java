package com.ingenico.m360.testingproject.service;

import com.ingenico.m360.testingproject.entity.Department;
import com.ingenico.m360.testingproject.error.DepartmentNotFoundException;
import com.ingenico.m360.testingproject.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImplementation implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department =  departmentRepository.findById(departmentId);
        if (!department.isPresent()) {
            throw new DepartmentNotFoundException("Department not available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) throws DepartmentNotFoundException {

        Optional<Department> checkDepartment = departmentRepository.findById(departmentId);///.get();

        if(!checkDepartment.isPresent()) {
            throw new DepartmentNotFoundException("yup the department is not available.he he");
        }
        Department oldDepartment = checkDepartment.get();

        if (Objects.nonNull(department.getDepartmentName()) &&
                !"".equalsIgnoreCase(department.getDepartmentName())){
            oldDepartment.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartment_address()) &&
                !"".equalsIgnoreCase(department.getDepartment_address())){
            oldDepartment.setDepartment_address(department.getDepartment_address());
        }

        if (Objects.nonNull(department.getDepartment_code()) &&
                !"".equalsIgnoreCase(department.getDepartment_code())){
            oldDepartment.setDepartment_code(department.getDepartment_code());
        }

        return departmentRepository.save(oldDepartment);
    }

    @Override
    public Department getDepartmentByName(String name) {
       /* int size = departmentRepository.findAll().size();

        for(Department department : departmentRepository.findAll()){
            if(department.getDepartment_name().equals(name)){
                return department;
            }
        }
        return null;*/
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }
}
