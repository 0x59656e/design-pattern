package com.designpattern;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.singleton.Snowflake;

public class SingletonTest {
    final static Logger logger = LoggerFactory.getLogger(SingletonTest.class);

    @Test
    public void instanceShouldSame() {
        Snowflake snowflake = Snowflake.INSTANCE;
        if (snowflake == getSnow()) {
            logger.info("Same snowflake");
        }
        assertSame(snowflake, getSnow());
    }

    public Snowflake getSnow() {
        return Snowflake.INSTANCE;
    }
}
