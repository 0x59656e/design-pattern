package com.designpattern.strategy;

public class TravelContext {
    Strategy travelStrategy;

    public void travel(Budget budget) {
        this.travelStrategy.travel(budget);
    }

    public void setTravelStrategy(Strategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

}
