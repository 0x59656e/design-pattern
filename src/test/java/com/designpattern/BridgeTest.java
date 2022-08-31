package com.designpattern;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.bridge.ConcreteApp;
import com.designpattern.bridge.App;
import com.designpattern.bridge.FooBarPlugin;
import com.designpattern.bridge.Plugin;
import com.designpattern.bridge.RickRollPlugin;

public class BridgeTest {

    static final Logger LOGGER = LoggerFactory.getLogger(BridgeTest.class);

    @Test
    public void testBridge() {
        Plugin p1 = new FooBarPlugin();
        Plugin p2 = new RickRollPlugin();
        App app = new ConcreteApp(p1);
        app.getDescription();
        App app2 = new ConcreteApp(p2);
        app2.getDescription();
        assertNotEquals(app, app2);
    }
}
