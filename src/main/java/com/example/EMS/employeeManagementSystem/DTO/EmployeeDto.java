package com.example.EMS.employeeManagementSystem.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {
    private Long jobId;
    private String employeeName;
    private String employeeEmail;
    private String employeeContact;
    private String employeeProfile;
    private String employeeLocation;
}