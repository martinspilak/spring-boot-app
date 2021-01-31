package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Employee.model.*;
import java.util.List;

public interface EmployeeService {
     float salarySum(List<JobType>list);
     int bonusSum(List<JobType>list);
     int writeNumber();
}
