package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.mediator.ChatRoomMediator;
import com.designpattern.mediator.User;

public class TestMediator {
    final static Logger LOGGER = LoggerFactory.getLogger(TestMediator.class);

    @Test
    public void name() {
        ChatRoomMediator<User, String> chatRoomMediator = new ChatRoomMediator<>();
        User u1 = new User((long) 1, "Hello Guys");
        User u2 = new User((long) 2, "Good evening");
        chatRoomMediator.communicate(u1.getId(), u1.getDescription());
        chatRoomMediator.communicate(u2.getId(), u2.getDescription());
    }
}
