package kz.kbtu.dbsample.controller;

import kz.kbtu.dbsample.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}