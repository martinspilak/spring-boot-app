package com.appslab.springbootapp;
import com.appslab.springbootapp.model.*;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class DependencyInjectionDemo  {
 EmployeeService employeeService;
    List<JobType> list = Arrays.asList(new Programmer(1700.0f, 200),new Teacher(900.0f, 300),new Driver(1000.0f, 300));
     public String getSum(List<JobType> list){
         return employeeService.salarySum(list)+" "+employeeService.bonusSum(list);
     }
    public DependencyInjectionDemo(EmployeeService employeService){
        this.employeeService = employeService;
        System.out.println(getSum(list));
        System.out.println(employeService.writeNumber());

    }
}
