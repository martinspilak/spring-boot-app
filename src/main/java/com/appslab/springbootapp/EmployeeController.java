package com.appslab.springbootapp;
import com.appslab.springbootapp.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class EmployeeController {
    EmployeeService employeService;
    List<JobType> list = Arrays.asList(new Programmer(1700.0f, 200),new Teacher(900.0f, 300),new Driver(1000.0f, 300));
    public EmployeeController(EmployeeService employeService){
        this.employeService = employeService;
    }
    @GetMapping(value = "/hello")
    public String hello(){
        return " Hello Spring Boot";
    }
    @GetMapping(value = "/salary")
    public double totalSalary(){
        return employeService.salarySum(list);
    }
    @GetMapping(value = "/bonus")
    public int totalBonus(){
        return employeService.bonusSum(list);
    }
    @GetMapping(value = "/snail")
    public double snail(@RequestParam double stepHeight, @RequestParam double stepLength, @RequestParam double towerHeight){
        return (towerHeight / stepHeight) * (stepHeight + stepLength);
    }
}
