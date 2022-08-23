package com.designpattern.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryProvider {
    static final Logger logger = LoggerFactory.getLogger(FactoryProvider.class);

    private FactoryProvider() {
        logger.warn("Factory provider class, do not instantiate.");
    }

    public static OlrsFurnitureFactory provideFactory(Series series) {
        switch (series) {
            case ALEX:
                logger.info("Create ALEX Series Factory.");
                return new AlexSeriesFurnitureFactory();

            case SKADIS:
                logger.info("Create SKADIS Series Factory.");
                return new SkadisSeriesFurnitureFactory();

            default:
                break;
        }
        logger.warn("No such factory found.");
        return null;
    }
}
