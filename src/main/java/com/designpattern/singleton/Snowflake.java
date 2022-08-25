package com.designpattern.singleton;

public enum Snowflake {
    INSTANCE;

    private String figure = "Unique Snowflake";

    public String getFigure() {
        return figure;
    }

}
