package com.designpattern.adapter;

import com.designpattern.entity.Base;

public class CelsiusMeter extends Base implements Temperature {
    private Integer degree;

    public CelsiusMeter(Long id, String description, Integer degree) {
        super(id, description);
        this.degree = degree;
    }

    @Override
    public Integer getTemperature() {
        return this.degree;
    }

}
