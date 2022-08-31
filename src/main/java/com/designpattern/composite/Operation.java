package com.designpattern.composite;

public class Operation extends Employee {
    String description = "Operations Engineer";

    public Operation(Long id, String name, String department, Integer salary) {
        super(id, name, department, salary);
    }
    
}
