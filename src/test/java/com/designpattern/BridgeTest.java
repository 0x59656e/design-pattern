package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.bridge.Application;
import com.designpattern.bridge.ConcreteApplication;

public class BridgeTest {

    final static Logger LOGGER = LoggerFactory.getLogger(BridgeTest.class);

    @Test
    public void compositionShouldOverInheritance() {
        // Application - PluginFeatures
        Application app = new ConcreteApplication();
    }
}
