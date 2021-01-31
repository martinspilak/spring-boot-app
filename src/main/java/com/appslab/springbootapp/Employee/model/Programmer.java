package com.appslab.springbootapp.Employee.model;

public class Programmer extends JobType   {
    public Programmer(float salary, int bonus){
        super(salary, bonus, Employee.PROGRAMMER);
    }
    public void getInfo() {
        System.out.println(employee.job + "'s" + " salary is " + (salary + (float) bonus) + ".");
    }
}
