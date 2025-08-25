package com.example.EMS.employeeManagementSystem.service;

import com.example.EMS.employeeManagementSystem.DTO.AddEmployeeDto;
import com.example.EMS.employeeManagementSystem.DTO.EmployeeDto;


import java.util.List;

public interface EmployeeServices {
     List<EmployeeDto> getAllEmployees();

      EmployeeDto getEmployeeByID(Long id);

     void addEmployee(AddEmployeeDto employee);
}
