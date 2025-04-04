package com.interview.leadinterview.services;

import org.springframework.stereotype.Service;

import com.interview.leadinterview.controllers.Employee;

@Service
public class EmployeeService {
    public Employee saveEmployee(Employee employee) {
        // Logic to save employee, e.g., repository.save(employee);
        return employee; // Mock implementation
    }
}