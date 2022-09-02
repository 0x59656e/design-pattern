package com.designpattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LowCostStrategy implements Strategy {
    static final Logger LOGGER = LoggerFactory.getLogger(LowCostStrategy.class);

    @Override
    public void travel(Budget budget) {
        LOGGER.info("Current Strategy: {}, so I go to the destination by bus", budget);
    }

}
