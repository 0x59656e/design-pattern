package com.designpattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.prototype.Cancer;
import com.designpattern.prototype.Cell;

public class PrototypeTest {
    final static Logger logger = LoggerFactory.getLogger(PrototypeTest.class);

    @Test
    public void clonedObjShouldSameValue() {
        Cell cancer = new Cancer(1l, "first cancer cell");
        assertEquals(cancer, cancer.copy());
    }
}
