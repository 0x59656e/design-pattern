package com.designpattern.composite;

public class Developer extends Employee {
    String description = "Software Developer";

    public Developer(Long id, String name, String department, Integer salary) {
        super(id, name, department, salary);
    }
}
