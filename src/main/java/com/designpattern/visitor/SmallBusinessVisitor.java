package com.designpattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmallBusinessVisitor implements Visitor {
    static final Logger LOGGER = LoggerFactory.getLogger(SmallBusinessVisitor.class);

    @Override
    public void visit(Client client) {
        LOGGER.info("Selling business insurance to {}", client.getClass().getSimpleName());
    }

}
