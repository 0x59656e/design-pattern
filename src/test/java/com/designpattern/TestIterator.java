package com.designpattern;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.iterator.PrimeNumber;

public class TestIterator {
    final static Logger LOGGER = LoggerFactory.getLogger(TestIterator.class);

    @Test
    public void name() {
        PrimeNumber primeNumber = new PrimeNumber(List.of(1,3,5,8,9,12,11,19));
        LOGGER.info("{}", primeNumber.getNumList());
        Iterator<Integer> iterator = primeNumber.getIterator();
        while (iterator.hasNext()) {
            LOGGER.info("{}", iterator.next());
        }
    }
}
