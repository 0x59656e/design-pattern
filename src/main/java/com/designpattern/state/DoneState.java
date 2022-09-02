package com.designpattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoneState implements State {
    static final Logger LOGGER = LoggerFactory.getLogger(DoneState.class);
    static final String STATE = "DONE";

    @Override
    public void action() {
        LOGGER.info("Current State: {}", STATE);
    }

}
