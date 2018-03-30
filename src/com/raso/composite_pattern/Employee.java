package com.raso.composite_pattern;

import java.util.ArrayList;

public class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary){

        this.name = name;
        this.salary = salary;

    }

    private ArrayList<Employee> subordinateList = new ArrayList<>();

    public ArrayList<Employee> getSubordinateList() {
        return subordinateList;
    }

    public void add(Employee e){
        subordinateList.add(e);
    }

    public void remove(Employee e){
        subordinateList.remove(e);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
