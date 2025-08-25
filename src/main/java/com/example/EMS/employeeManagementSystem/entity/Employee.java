package com.example.EMS.employeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

//@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
    private String employeeName;
    private String employeeEmail;
    private String employeeContact;
    private String employeeProfile;
    private String employeeLocation;

}
