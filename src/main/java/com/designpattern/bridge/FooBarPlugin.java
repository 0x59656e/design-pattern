package com.designpattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class FooBarPlugin implements Plugin {
    
    static final Logger logger = LoggerFactory.getLogger(FooBarPlugin.class);

    @Override
    public void addDescription() {
        logger.info("Foo Bar Baz!");
    }

}
