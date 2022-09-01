package com.designpattern.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DigitHandler extends Handler {
    static final Logger LOGGER = LoggerFactory.getLogger(DigitHandler.class);

    public DigitHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    Boolean check(String password) {
        LOGGER.info("{}::Start checking password digits ...", DigitHandler.class.getSimpleName());
        var rs = password.length() > 8;
        LOGGER.info("Passed: {}", rs);
        return rs;
    }

}
