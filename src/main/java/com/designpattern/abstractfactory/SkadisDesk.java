package com.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.entity.Base;

public class SkadisDesk extends Base implements Desk {
    static final Logger logger = LoggerFactory.getLogger(SkadisDesk.class);

    @Override
    public void putStuffOn() {
        logger.info("Put something on the Skadis Series Desk.");
    }

    @Override
    public void adjustHeight() {
        logger.warn("You can not adjust the height of Skadis Series Desk.");
    }

}
