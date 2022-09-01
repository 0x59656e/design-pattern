package com.designpattern.flyweight;

public class Pokemon {
    private String name;
    private Integer iv;

    public Pokemon(String name, Integer iv) {
        this.name = name;
        this.iv = iv;
    }

    @Override
    public String toString() {
        return "Pokemon [iv=" + iv + ", name=" + name + "]";
    }

    
}
