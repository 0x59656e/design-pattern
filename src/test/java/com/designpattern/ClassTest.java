package com.designpattern;

import java.util.Random;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassTest {
    private static final Random RANDOM_ID = new Random();

    @Test
    void Should_do_sth_when_condition() {
        log.info("{}", RANDOM_ID.nextLong());
        // assert
    }

}
