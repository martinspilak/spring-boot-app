package com.appslab.springbootapp.model;

public class JobType   {
    public float salary;
    public int bonus;
    public Employee employee;

    public JobType(float salary, int bonus, Employee employee){
        this.salary = salary;
        this.bonus = bonus;
        this.employee = employee;
    }
    public void getInfo() {
        System.out.println(employee.job + "'s" + " salary is " + salary + " and bonus is " + bonus+".");
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
}
