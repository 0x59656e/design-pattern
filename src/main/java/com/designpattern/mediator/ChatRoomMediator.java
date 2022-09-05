package com.designpattern.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatRoomMediator<T, G> implements Mediator {
    static final Logger LOGGER = LoggerFactory.getLogger(ChatRoomMediator.class);

    @Override
    public void communicate(Object t, Object g) {
        LOGGER.info("User#{}: {}", t, g);
    }
}
