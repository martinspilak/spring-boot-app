package com.appslab.springbootapp.Employee;


public class SecondClass {
    EmployeeService employeeService;
    public SecondClass(EmployeeService employeeService){
        System.out.println(employeeService.writeNumber());
    }
}

