package com.appslab.springbootapp.Employee.model;

public class Teacher extends  JobType{
    public Teacher(float salary, int bonus){
        super(salary, bonus, Employee.TEACHER);
    }

}
