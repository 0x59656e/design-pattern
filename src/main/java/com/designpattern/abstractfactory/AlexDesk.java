package com.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.entity.Base;

public class AlexDesk extends Base implements Desk {
    static final Logger logger = LoggerFactory.getLogger(AlexDesk.class);

    @Override
    public void putStuffOn() {
        logger.info("Put something on the Alex Series Desk.");
    }

    @Override
    public void adjustHeight() {
        logger.info("You adjust the height of Alex Series Desk to make it more ergonomic.");
    }

}
