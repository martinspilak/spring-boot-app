package com.appslab.springbootapp.model;

public class Driver extends  JobType{
    public Driver(float salary, int bonus){
        super(salary, bonus, Employee.DRIVER);
    }

}
