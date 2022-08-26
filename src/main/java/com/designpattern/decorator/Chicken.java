package com.designpattern.decorator;

import com.designpattern.entity.Base;

public class Chicken extends Base implements Wrap {

    @Override
    public void wrap() {
        this.setDescription("Raw chicken");
    }

}
