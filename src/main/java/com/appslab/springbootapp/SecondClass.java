package com.appslab.springbootapp;


public class SecondClass {
    EmployeeService employeeService;
    public SecondClass(EmployeeService employeeService){
        System.out.println(employeeService.writeNumber());
    }
}

