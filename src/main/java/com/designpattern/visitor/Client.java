package com.designpattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Client {
    static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
    private String description;

    Client(String description) {
        this.description = description;
    }

    abstract void accept(Visitor visitor);

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
