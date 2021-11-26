package com.example.app.controller;

import com.example.app.model.Employee;
import com.example.app.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping(value = "")
    @Cacheable(cacheNames = "employee_list")
    public List<Employee> findAll(){
        System.out.println("fetch to db");
        return employeeRepository.findAll();
    }

    @PostMapping(value = "")
    @CacheEvict(cacheNames = "employee_list", allEntries = true)
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
