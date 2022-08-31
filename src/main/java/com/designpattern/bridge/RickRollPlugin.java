package com.designpattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RickRollPlugin implements Plugin {
    static final Logger logger = LoggerFactory.getLogger(RickRollPlugin.class);

    @Override
    public void addDescription() {
        logger.info("\nNever gonna give you up.\nNever gonna let you down.\nNever gonna run around and desert you.");
    }

}
