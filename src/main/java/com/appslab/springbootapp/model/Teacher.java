package com.appslab.springbootapp.model;

public class Teacher extends  JobType{
    public Teacher(float salary, int bonus){
        super(salary, bonus, Employee.TEACHER);
    }

}
