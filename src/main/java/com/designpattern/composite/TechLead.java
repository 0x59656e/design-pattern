package com.designpattern.composite;

public class TechLead extends Employee {
    String description = "Lead of Technology Department";

    public TechLead(Long id, String name, String department, Integer salary) {
        super(id, name, department, salary);
    }

}
