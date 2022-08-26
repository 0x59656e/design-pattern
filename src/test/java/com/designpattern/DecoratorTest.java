package com.designpattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.decorator.Chicken;
import com.designpattern.decorator.Wrap;
import com.designpattern.decorator.Wrapper;

public class DecoratorTest {

    final static Logger LOGGER = LoggerFactory.getLogger(DecoratorTest.class);

    @Test
    public void propertyShouldChangeDynamically() {
        Chicken rawChicken = new Chicken();
        rawChicken.wrap();
        LOGGER.info(rawChicken.getDescription());
        Wrap chickenWrap = new Wrapper(rawChicken);
        chickenWrap.wrap();
        LOGGER.info(rawChicken.getDescription());
        assertEquals("Raw chicken Wrapped with paper", rawChicken.getDescription());
    }
}
