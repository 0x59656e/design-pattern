package com.designpattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class WorkProxy implements GetWorkDone {
    static final Logger LOGGER = LoggerFactory.getLogger(WorkProxy.class);
    private Work realWorker = new Work();

    private void before() {
        LOGGER.info("Call before execute ...");

    }

    @Override
    public void execute() {
        before();
        realWorker.execute();
        after();
    }

    private void after() {
        LOGGER.info("Call after execute ...");

    }
}
