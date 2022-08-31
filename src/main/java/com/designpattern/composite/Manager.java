package com.designpattern.composite;

public class Manager extends Employee {
    String description = "Manager of Non-tech Department";

    public Manager(Long id, String name, String department, Integer salary) {
        super(id, name, department, salary);
    }

}
