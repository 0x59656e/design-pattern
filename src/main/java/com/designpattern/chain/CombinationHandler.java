package com.designpattern.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombinationHandler extends Handler {
    static final Logger LOGGER = LoggerFactory.getLogger(CombinationHandler.class);

    public CombinationHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    Boolean check(String password) {
        LOGGER.info("{}::Start checking combination...", CombinationHandler.class.getSimpleName());
        var rs = password.matches("^[a-zA-Z0-9_.-]*$");
        LOGGER.info("Passed: {}", rs);
        return rs;
    }

}
