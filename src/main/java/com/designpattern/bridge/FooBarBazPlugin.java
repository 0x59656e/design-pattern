package com.designpattern.bridge;

public class FooBarBazPlugin implements Plugin<String> {

    @Override
    public String function() {
        return "Foo Bar Baz";
    }

}
