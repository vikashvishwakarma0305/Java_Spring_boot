package com.example.EMS.employeeManagementSystem.service.impl;

import com.example.EMS.employeeManagementSystem.DTO.EmployeeDto;
import com.example.EMS.employeeManagementSystem.entity.Employee;
import com.example.EMS.employeeManagementSystem.repository.EmployeeRepository;
import com.example.EMS.employeeManagementSystem.service.EmployeeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeServices {

    private final EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees =employeeRepository.findAll();
        System.out.println(employees);
        List<EmployeeDto> allEmployees=employees.stream().map(employee-> new EmployeeDto(employee.getJobId(),employee.getEmployeeName(),employee.getEmployeeEmail(),employee.getEmployeeContact(),employee.getEmployeeProfile(),employee.getEmployeeLocation())).toList();
        return allEmployees;
    }
}
