package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.strategy.Budget;
import com.designpattern.strategy.HighCostStrategy;
import com.designpattern.strategy.LowCostStrategy;
import com.designpattern.strategy.MediumCostStrategy;
import com.designpattern.strategy.TravelContext;

public class TestStrategy {
    final static Logger LOGGER = LoggerFactory.getLogger(TestStrategy.class);

    @Test
    public void testStrategyInDifferentContext() {
        // Travel Strategy in 3 different Conditions
        TravelContext travelContext = new TravelContext();
        travelContext.setTravelStrategy(new LowCostStrategy());
        travelContext.travel(Budget.LOW_COST);
        travelContext.setTravelStrategy(new MediumCostStrategy());
        travelContext.travel(Budget.MEDIUM_COST);
        travelContext.setTravelStrategy(new HighCostStrategy());
        travelContext.travel(Budget.HIGH_COST);
    }
}
