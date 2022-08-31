package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

import com.designpattern.entity.Base;

public abstract class Employee extends Base {
    String name;
    String department;
    Integer salary;
    private List<Employee> subordinate = new ArrayList<>();

    Employee(Long id, String name, String department, Integer salary) {
        super(id);
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void add(Employee e) {
        this.subordinate.add(e);
    }

    public void remove(Employee e) {
        this.subordinate.remove(e);
    }

    public List<Employee> getSubordinate() {
        return this.subordinate;
    }
    
}
