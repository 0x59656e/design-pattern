package com.designpattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Template {
    static final Logger LOGGER = LoggerFactory.getLogger(Template.class);
    String description;

    public Template(String description) {
        this.description = description;
    }

    abstract void init();

    abstract void pre();

    abstract void post();

    public final void run() {
        LOGGER.info(description);
        pre();
        init();
        post();
    }
}
