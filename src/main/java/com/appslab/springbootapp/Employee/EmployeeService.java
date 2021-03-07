package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Company.Company;
import com.appslab.springbootapp.Employee.model.*;
import java.util.List;

public interface EmployeeService {
     void saveEmployee(Employee employee);
     float salarySum(List<JobType>list);
     int bonusSum(List<JobType>list);
     int writeNumber();

}
