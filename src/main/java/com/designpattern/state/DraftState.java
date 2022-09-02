package com.designpattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraftState implements State {
    static final Logger LOGGER = LoggerFactory.getLogger(DraftState.class);
    static final String STATE = "DRAFT";

    @Override
    public void action() {
        LOGGER.info("Current State: {}", STATE);
    }

}
