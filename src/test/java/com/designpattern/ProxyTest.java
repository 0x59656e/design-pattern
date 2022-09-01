package com.designpattern;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.proxy.WorkProxy;

public class ProxyTest {
    static final Logger LOGGER = LoggerFactory.getLogger(ProxyTest.class);

    @Test
    public void testProxyWorks() {
        // new proxy
        // send request to proxy
        // the additional function triggered 
        WorkProxy wp = new WorkProxy();
        wp.execute();
    }
}
