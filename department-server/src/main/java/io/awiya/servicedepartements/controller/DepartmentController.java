package io.awiya.servicedepartements.controller;


import io.awiya.servicedepartements.client.EmployeeClient;
import io.awiya.servicedepartements.model.Department;
import io.awiya.servicedepartements.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(DepartmentController.class);


    private final DepartmentRepository repository;


    

    public DepartmentController(DepartmentRepository repository) {
        this.repository = repository;

    }

    @PostMapping
    public Department add(@RequestBody Department department) {
        LOGGER.info("Department add: {}", department);
        return repository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll() {
        LOGGER.info("Department find");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id) {
        LOGGER.info("Department find: id={}", id);
        return repository.findById(id);
    }

    

}
