package com.designpattern;

import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.abstractfactory.Desk;
import com.designpattern.abstractfactory.Drawer;
import com.designpattern.abstractfactory.FactoryProvider;
import com.designpattern.abstractfactory.OlrsFurnitureFactory;
import com.designpattern.abstractfactory.Series;

public class AbstractFactoryTest {
    static final Logger logger = LoggerFactory.getLogger(AbstractFactoryTest.class);

    @Test
    public void factoryShouldCreateDifferentSeriesFurniture() {
        OlrsFurnitureFactory alexFactory = FactoryProvider.provideFactory(Series.ALEX);
        OlrsFurnitureFactory skadisFactory = FactoryProvider.provideFactory(Series.SKADIS);
        assertNotSame(alexFactory, skadisFactory);
        Desk aDesk = alexFactory.getDesk();
        aDesk.adjustHeight();
        aDesk.putStuffOn();
        Drawer aDrawer = alexFactory.getDrawer();
        aDrawer.putStuffIn();
        aDrawer.onCaster();
        Desk sDesk = skadisFactory.getDesk();
        sDesk.adjustHeight();
        sDesk.putStuffOn();
        Drawer sDrawer = skadisFactory.getDrawer();
        sDrawer.putStuffIn();
        sDrawer.onCaster();
    }
}
