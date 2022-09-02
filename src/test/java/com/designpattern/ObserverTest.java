package com.designpattern;

import java.util.Random;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.observer.RuralAreaWatcher;
import com.designpattern.observer.WeatherReport;
import com.designpattern.observer.Weathers;

public class ObserverTest {
    final static Logger LOGGER = LoggerFactory.getLogger(TestTemplate.class);
    Random rand;

    @Test
    public void testObserver() {
        WeatherReport wr = new WeatherReport();
        wr.sub(new RuralAreaWatcher());
        wr.climateChange(Weathers.CLOUDY);
        wr.climateChange(Weathers.RAINY);
        wr.climateChange(Weathers.FROG);
        // Publisher publisher = new Publisher();
        // publisher.sub(new TimeSubscriber());
        // publisher.notifySubs();

    }
}
