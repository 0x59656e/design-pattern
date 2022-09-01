package com.designpattern;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeNoException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.chain.CombinationHandler;
import com.designpattern.chain.DigitHandler;
import com.designpattern.chain.Handler;

public class CorTest {
    static final Logger LOGGER = LoggerFactory.getLogger(CorTest.class);
    static final String PASSWORD = "hQ8ikEySHjzck";
    static final String UNCOMPLIANT_PASSWORD = "*(&*(((&*()*(";
    // static final String UNCOMPLIANT_PASSWORD = "Pard";

    @Test
    public void corChecksPasswordShouldPass() throws Exception {
        // Given a Password String
        // Do Checks:
        // - digits longer than over 8
        // - should have num + char + spec
        // - cannot be password, Passw0rd, Password
        Handler passwordHandler;
        passwordHandler = new DigitHandler(new CombinationHandler(null));
        var rs = passwordHandler.handle(PASSWORD);
        assertTrue(rs);
    }

    @Test(expected = Exception.class)
    public void corChecksPasswordShouldFail() throws Exception {
        Handler passwordHandler;
        passwordHandler = new DigitHandler(new CombinationHandler(null));
        passwordHandler.handle(UNCOMPLIANT_PASSWORD);
    }
}
