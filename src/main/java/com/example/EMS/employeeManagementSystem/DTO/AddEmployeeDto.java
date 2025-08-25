package com.example.EMS.employeeManagementSystem.DTO;

import lombok.Data;

@Data
public class AddEmployeeDto {
    private String employeeName;
    private String employeeEmail;
    private String employeeContact;
    private String employeeProfile;
    private String employeeLocation;
}
