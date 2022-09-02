package com.designpattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuralAreaWatcher implements Subscriber {
    static final Logger LOGGER = LoggerFactory.getLogger(RuralAreaWatcher.class);

    @Override
    public void update(Weathers weather) {
        LOGGER.info("Weather at Rural Area: {}", weather);
    }

}
