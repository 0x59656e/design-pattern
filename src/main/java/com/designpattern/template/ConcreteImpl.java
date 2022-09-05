package com.designpattern.template;

public class ConcreteImpl extends Template {

    public ConcreteImpl(String description) {
        super(description);
    }

    @Override
    void init() {
        LOGGER.info("Init process");
    }

    @Override
    void pre() {
        LOGGER.info("Doing Preparation");
    }

    @Override
    void post() {
        LOGGER.info("Clean up");
    }
    
}
