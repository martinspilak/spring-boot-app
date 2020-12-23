package com.appslab.springbootapp.model;

public enum Employee {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    public final String job;

    Employee(String job){
        this.job = job;
    }
}
