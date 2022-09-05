package com.designpattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FamilyVisitor implements Visitor {
    static final Logger LOGGER = LoggerFactory.getLogger(FamilyVisitor.class);

    @Override
    public void visit(Client client) {
        LOGGER.info("Selling health insurance to {}", client.getClass().getSimpleName());
    }

}
