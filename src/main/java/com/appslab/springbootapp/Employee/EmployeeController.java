package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Employee.model.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EmployeeController {
    EmployeeService employeeService;
    List<JobType> list = Arrays.asList(new Programmer(1700.0f, 200),new Teacher(900.0f, 300),new Driver(1000.0f, 300));
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping(value = "/hello")
    public String hello(){
        return " Hello Spring Boot";
    }
    @GetMapping(value = "/salary")
    public double totalSalary(){
        return employeeService.salarySum(list);
    }
    @GetMapping(value = "/bonus")
    public int totalBonus(){
        return employeeService.bonusSum(list);
    }
    @GetMapping(value = "/snail")
    public double snail(@RequestParam double stepHeight, @RequestParam double stepLength, @RequestParam double towerHeight){
        return (towerHeight / stepHeight) * (stepHeight + stepLength);
    }
}
