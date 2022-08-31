package com.designpattern.composite;

public class Auditor extends Employee {
    String description = "Auditor";

    public Auditor(Long id, String name, String department, Integer salary) {
        super(id, name, department, salary);
    }

}
