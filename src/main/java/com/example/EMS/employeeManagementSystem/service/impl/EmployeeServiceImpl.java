package com.example.EMS.employeeManagementSystem.service.impl;

import com.example.EMS.employeeManagementSystem.DTO.AddEmployeeDto;
import com.example.EMS.employeeManagementSystem.DTO.EmployeeDto;
import com.example.EMS.employeeManagementSystem.entity.Employee;
import com.example.EMS.employeeManagementSystem.repository.EmployeeRepository;
import com.example.EMS.employeeManagementSystem.service.EmployeeServices;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeServices {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees =employeeRepository.findAll();
        System.out.println(employees);
        List<EmployeeDto> allEmployees=employees.stream().map(employee-> modelMapper.map(employee,EmployeeDto.class)).toList();
        return allEmployees;
    }

    @Override
    public EmployeeDto getEmployeeByID(Long id) {

      Optional<Employee> employee= employeeRepository.findById(id);
       EmployeeDto employeeDto= modelMapper.map(employee,EmployeeDto.class);

        return employeeDto;
    }

    @Override
    public void addEmployee(AddEmployeeDto employee) {
        Employee newEmployee = modelMapper.map(employee,Employee.class);
         employeeRepository.save(newEmployee);
    }
}
