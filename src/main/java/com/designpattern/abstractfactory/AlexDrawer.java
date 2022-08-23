package com.designpattern.abstractfactory;

import com.designpattern.entity.Base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlexDrawer extends Base implements Drawer {
    static final Logger logger = LoggerFactory.getLogger(AlexDrawer.class);

    @Override
    public void putStuffIn() {
        logger.info("You put something into the Alex Series Drawer");
    }

    @Override
    public void onCaster() {
        logger.info("You push the Alex Series Drawer to the other side of the room.");
    }

}
