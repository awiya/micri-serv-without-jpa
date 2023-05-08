package io.awiya.servicedepartements.repository;


import io.awiya.servicedepartements.exceptions.DepartmentNotFoundException;
import io.awiya.servicedepartements.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private List<Department> departments = new ArrayList<>();

    public Department addDepartment(Department department) {
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        return departments.stream()
                .filter(department -> department.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new DepartmentNotFoundException(String.format("The department with the id: %s has not been found", id)));
    }

    public List<Department> findAll() {
        return departments;
    }

}
