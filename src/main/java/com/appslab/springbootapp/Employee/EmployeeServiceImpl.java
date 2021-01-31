package com.appslab.springbootapp.Employee;
import com.appslab.springbootapp.Employee.model.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public float salarySum(List<JobType>list){
        return (float) list.stream().mapToDouble(JobType::getSalary).sum();
    }
    @Override
    public int bonusSum(List<JobType>list){
        return  list.stream().mapToInt(JobType::getBonus).sum();
    }

    int number = 0;
    @Override
    public int writeNumber(){
       return  number =+1;
    }
}
