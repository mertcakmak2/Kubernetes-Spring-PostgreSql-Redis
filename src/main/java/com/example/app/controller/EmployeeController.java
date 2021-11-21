package com.example.app.controller;

import com.example.app.model.Employee;
import com.example.app.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping(value = "")
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @PostMapping(value = "")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
