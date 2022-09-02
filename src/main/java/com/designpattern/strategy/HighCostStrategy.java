package com.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighCostStrategy implements Strategy {
    static final Logger LOGGER = LoggerFactory.getLogger(HighCostStrategy.class);

    @Override
    public void travel(Budget budget) {
        LOGGER.info("Current Strategy: {}, so I go to the destination by plane", budget);
    }

}
