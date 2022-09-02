package com.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MediumCostStrategy implements Strategy {
    static final Logger LOGGER = LoggerFactory.getLogger(MediumCostStrategy.class);

    @Override
    public void travel(Budget budget) {
        LOGGER.info("Current Strategy: {}, so I go to the destination by train", budget);
    }

}
