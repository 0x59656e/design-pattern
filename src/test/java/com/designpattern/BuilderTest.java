package com.designpattern;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.builder.BarComponent;
import com.designpattern.builder.BazComponent;
import com.designpattern.builder.ComponentBuilder;
import com.designpattern.builder.FooComponent;
import com.designpattern.builder.SomeContainer;

public class BuilderTest {
    final static Logger logger = LoggerFactory.getLogger(BaseEntityTest.class);

    @Test
    public void shouldBuildDifferentContainer() {
        FooComponent fooComponent = new FooComponent(1l, "foo");
        BarComponent barComponent = new BarComponent(2l, "bar");
        BazComponent bazComponent = new BazComponent(3l, "baz");
        ComponentBuilder cBuilder = new ComponentBuilder();
        SomeContainer containerSingleComponent = cBuilder.setFoo(fooComponent).build();
        logger.info(containerSingleComponent.toString());
        assertNotNull(containerSingleComponent);
        SomeContainer containerTwoComponents = cBuilder.setFoo(fooComponent).setBar(barComponent).build();
        logger.info(containerTwoComponents.toString());
        assertNotNull(containerTwoComponents);
        SomeContainer containerThreeComponents = cBuilder.setFoo(fooComponent).setBar(barComponent).setBaz(bazComponent)
                .build();
        logger.info(containerThreeComponents.toString());
        assertNotNull(containerThreeComponents);
    }

}
