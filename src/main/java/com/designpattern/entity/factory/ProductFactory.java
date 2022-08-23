package com.designpattern.entity.factory;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductFactory {
    static final Logger logger = LoggerFactory.getLogger(ProductFactory.class);

    private ProductFactory() {
        throw new IllegalStateException("Factory class, do not instantiate.");
    }

    public static ProductTexture getProduct(ProductType productType) {
        switch (productType) {
            case GOLDEN_PRODUCT:
                GoldenProduct goldenProduct = new GoldenProduct(1l, "Factory Demo",
                        Timestamp.valueOf(LocalDateTime.now()), Timestamp.valueOf(LocalDateTime.now()), "Gold");
                return goldenProduct;

            case SILVER_PRODUCT:
                SilverProduct silverProduct = new SilverProduct(2l, "Factory Demo",
                        Timestamp.valueOf(LocalDateTime.now()), Timestamp.valueOf(LocalDateTime.now()), "Silver");
                return silverProduct;
            default:
                logger.warn("Nothing produced!");
                break;
        }
        return null;
    }
}
