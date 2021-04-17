package com.appslab.springbootapp.Employee;

import com.appslab.springbootapp.Company.Company;
import com.appslab.springbootapp.Course;

import javax.persistence.*;
import java.util.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="company_id", nullable=false, updatable = false)
    private Long companyId;

    public Employee(){
    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_course",joinColumns = @JoinColumn(name = "employee_id"),inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> course;

    public Employee(Long id, String name, Long companyId){
        this.id = id;
        this.name = name;
        this.companyId = companyId;
    }
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
}