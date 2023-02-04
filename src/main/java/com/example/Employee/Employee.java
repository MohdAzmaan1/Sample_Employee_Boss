package com.example.Employee;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private int rating;

    public Employee(String name, int age, int salary, int rating) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rating = rating;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
