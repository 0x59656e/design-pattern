package com.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Work implements GetWorkDone {
    static final Logger LOGGER = LoggerFactory.getLogger(Work.class);

    @Override
    public void execute() {
        LOGGER.info("Working by Real Worker");
    }

}
