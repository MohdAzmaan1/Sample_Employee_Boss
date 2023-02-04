package com.example.Employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> employeeList = new ArrayList<>();;
    List<Boss> bossList = new ArrayList<>();;


    public List<Employee> getEmployees() {
        return employeeList;
    }

    public void setEmployees(List<Employee> employees) {
        this.employeeList = employees;
    }

    public List<Boss> getBoss() {
        return bossList;
    }

    public void setBoss(List<Boss> boss) {
        this.bossList = boss;
    }

    public Employee addEmployees(Employee employee){
        employeeList.add(employee);
        return employee;
    }

    public Boss addBoss(Boss boss){
        bossList.add(boss);
        return boss;
    }

    public List<Employee> getEmployees(int age, int rating){
        List<Employee> ans = new ArrayList<>();
        for(Employee employee : employeeList){
            if(employee.getRating()==rating && employee.getAge()==age)
                ans.add(employee);
        }
        return ans;
    }

    public Boss updateBossSalary(int rating, int salary){
        for(Boss boss : bossList){
            if(boss.getRating() > rating){
                boss.setSalary(boss.getSalary() + salary);
                return boss;
            }
        }
        return null;
    }

    public int findEmployees(int empRating, int bossRating){
        int count = 0;
        for(Employee employee : employeeList){
            if(employee.getRating() > empRating && employee.getRating() > bossRating)
                count++;
        }
        return count;
    }
}
