package com.appslab.springbootapp;
import com.appslab.springbootapp.model.*;
import java.util.List;

public interface EmployeeService {
     float salarySum(List<JobType>list);
     int bonusSum(List<JobType>list);
     int writeNumber();
}
