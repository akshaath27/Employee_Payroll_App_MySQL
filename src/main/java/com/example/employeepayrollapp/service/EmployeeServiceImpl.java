package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee addEmployee(EmployeeDTO dto) {
        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return repository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO dto) {
        Employee emp = getEmployeeById(id);
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return repository.save(emp);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}