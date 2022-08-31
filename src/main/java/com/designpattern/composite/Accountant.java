package com.designpattern.composite;

public class Accountant extends Employee {
    String description = "Accountant";

    public Accountant(Long id, String name, String department, Integer salary) {
        super(id, name, department, salary);
    }

}
