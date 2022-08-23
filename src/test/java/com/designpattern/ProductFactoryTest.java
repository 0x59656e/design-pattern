package com.designpattern;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.entity.factory.ProductFactory;
import com.designpattern.entity.factory.ProductTexture;
import com.designpattern.entity.factory.ProductType;

public class ProductFactoryTest {
    final static Logger logger = LoggerFactory.getLogger(ProductFactoryTest.class);

    @Test
    public void testFactory() {
        ProductTexture gProduct = ProductFactory.getProduct(ProductType.GOLDEN_PRODUCT);
        assertNotNull(gProduct);
        logger.info(gProduct.toString());
        ProductTexture sProduct = ProductFactory.getProduct(ProductType.SILVER_PRODUCT);
        assertNotNull(sProduct);
        logger.info(sProduct.toString());
        assertNotSame(gProduct, sProduct);
    }
}
