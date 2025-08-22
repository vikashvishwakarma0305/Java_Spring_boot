package com.example.EMS.employeeManagementSystem.service;

import com.example.EMS.employeeManagementSystem.DTO.EmployeeDto;
import com.example.EMS.employeeManagementSystem.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeServices {
     List<EmployeeDto> getAllEmployees();
}
