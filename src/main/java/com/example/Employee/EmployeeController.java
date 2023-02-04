package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add-employees")
    public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee){
        employeeService.addEmployees(employee);
        return new ResponseEntity<>(employee, HttpStatus.ACCEPTED);
    }

    @PostMapping("/add-boss")
    public ResponseEntity<Boss> addBoss(@RequestBody Boss boss){
        employeeService.addBoss(boss);
        return new ResponseEntity<>(boss, HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-employees")
    public ResponseEntity<List<Employee>> getEmployees(@RequestParam("q1") int age, @RequestParam("q2") int rating){
        return new ResponseEntity<>(employeeService.getEmployees(age,rating), HttpStatus.ACCEPTED);
    }

    @PutMapping("/update-boss-salary/{rating}/{salary}")
    public ResponseEntity<Boss> updateBossSalary(@PathVariable("rating") int rating, @PathVariable("salary") int salary){
        return new ResponseEntity<>(employeeService.updateBossSalary(rating,salary), HttpStatus.ACCEPTED);
    }

    @GetMapping("find-employees/{q1}/{q2}")
    public ResponseEntity<Integer> findEmployees(@PathVariable("q1") int empRating, @PathVariable("q2") int bossRating){
        return new ResponseEntity<>(employeeService.findEmployees(empRating,bossRating), HttpStatus.ACCEPTED);
    }
}
