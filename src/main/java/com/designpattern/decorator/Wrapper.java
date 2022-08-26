package com.designpattern.decorator;

public class Wrapper implements Wrap {
    private Chicken chicken;

    public Wrapper(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void wrap() {
        this.chicken.setDescription(this.chicken.getDescription()+" Wrapped with paper");
    }

}
