package com.designpattern.bridge;

public class CalculatingPlugin implements Plugin<Integer> {

    @Override
    public Integer function() {
        return 1234;
    }

}
