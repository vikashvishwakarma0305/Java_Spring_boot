package com.example.EMS.employeeManagementSystem.controller;

import com.example.EMS.employeeManagementSystem.DTO.EmployeeDto;
import com.example.EMS.employeeManagementSystem.service.EmployeeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServices employeeServices;


    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees(){
        System.out.println("hello");
        System.out.println("fsd");
        return employeeServices.getAllEmployees();
    }
    @GetMapping("/getString")
    public String getHEllo(){
        return "Hello from spring";
    }
}
