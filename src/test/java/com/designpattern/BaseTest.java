package com.designpattern;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.sql.Timestamp;
import java.util.Random;
import org.junit.jupiter.api.Test;

import com.designpattern.entity.Base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseTest {
    private static final Random RANDOM_ID = new Random();

    @Test
    void Should_updated_time_when_set_description() {
        Base base = new Base(RANDOM_ID.nextLong(), "Test base obj");
        Timestamp updatedDateBefore = base.getUpdatedDate();
        log.info("{}", updatedDateBefore);
        base.setDescription("Foo bar");
        Timestamp updatedDateAfter = base.getUpdatedDate();
        log.info("{}", updatedDateAfter);
        assertNotEquals(updatedDateBefore, updatedDateAfter);
    }

}
