package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployees(Employee employee){
        return employeeRepository.addEmployees(employee);
    }

    public Boss addBoss(Boss boss){
        return employeeRepository.addBoss(boss);
    }

    public List<Employee> getEmployees(int age, int rating){
        return employeeRepository.getEmployees(age,rating);
    }

    public Boss updateBossSalary(int rating, int salary){
        return employeeRepository.updateBossSalary(rating, salary);
    }

    public int findEmployees(int empRating, int bossRating){
        return employeeRepository.findEmployees(empRating, bossRating);
    }
}
