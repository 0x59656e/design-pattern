package com.designpattern;

import static org.junit.Assert.assertNotNull;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.designpattern.entity.Base;

public class BaseEntityTest {
    final static Logger logger = LoggerFactory.getLogger(BaseEntityTest.class);

    @Test
    public void testCreateBaseObject() {
        Timestamp createdDate = Timestamp.valueOf(LocalDateTime.now());
        Timestamp updatedDate = Timestamp.valueOf(LocalDateTime.now());
        Base myBase = new Base(1l, "First Base Object", createdDate, updatedDate);
        logger.info(myBase.toString());
        assertNotNull(myBase);
    }


    @Test
    public void testCreateBaseObjectByAnotherConstructor() {
        Base myBase = new Base(2l, "Second Base Object");
        logger.info(myBase.toString());
        assertNotNull(myBase);
    }
}
