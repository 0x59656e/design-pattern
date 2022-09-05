package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.template.ConcreteImpl;

public class TestTemplate {
    final static Logger LOGGER = LoggerFactory.getLogger(TestTemplate.class);

    @Test
    public void name() {
        ConcreteImpl concreteImpl = new ConcreteImpl("Filled Template");
        concreteImpl.run();
    }
}
