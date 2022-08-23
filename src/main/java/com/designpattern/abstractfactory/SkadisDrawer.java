package com.designpattern.abstractfactory;

import com.designpattern.entity.Base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkadisDrawer extends Base implements Drawer {
    static final Logger logger = LoggerFactory.getLogger(SkadisDrawer.class);

    @Override
    public void putStuffIn() {
        logger.info("You put something into the Skadis Series Drawer");
    }

    @Override
    public void onCaster() {
        logger.info("You lift up the Skadis Series Drawer and take it to the other side of the room.");
    }

}
