package com.designpattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteApp implements App {
    private Plugin plugin;
    static final Logger LOGGER = LoggerFactory.getLogger(ConcreteApp.class);

    public ConcreteApp(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void getDescription() {
        LOGGER.info("Default App");
        plugin.addDescription();
    }

}
