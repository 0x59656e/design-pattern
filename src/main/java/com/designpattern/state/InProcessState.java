package com.designpattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InProcessState implements State {
    static final Logger LOGGER = LoggerFactory.getLogger(InProcessState.class);
    static final String STATE = "IN PROCESS";

    @Override
    public void action() {
        LOGGER.info("Current State: {}", STATE);
    }

}
