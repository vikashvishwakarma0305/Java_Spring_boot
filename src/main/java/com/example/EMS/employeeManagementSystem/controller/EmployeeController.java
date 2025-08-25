package com.example.EMS.employeeManagementSystem.controller;

import com.example.EMS.employeeManagementSystem.DTO.AddEmployeeDto;
import com.example.EMS.employeeManagementSystem.DTO.EmployeeDto;

import com.example.EMS.employeeManagementSystem.service.EmployeeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServices employeeServices;


    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        System.out.println("hello");
        System.out.println("fsd");
        return ResponseEntity.status(HttpStatus.OK).body(employeeServices.getAllEmployees());
    }
    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeServices.getEmployeeByID(id));
    }
    @PostMapping("/addEmployee")
    public ResponseEntity<String> addEmployee(@RequestBody AddEmployeeDto employee){

        employeeServices.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee enroll successfully");

    }

}
