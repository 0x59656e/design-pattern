package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeatherReport {
    static final Logger LOGGER = LoggerFactory.getLogger(WeatherReport.class);
    Weathers weather;
    List<Subscriber> watchers = new ArrayList<>();

    public void sub(Subscriber s) {
        watchers.add(s);
    }

    public void unsub(Subscriber s) {
        watchers.remove(s);
    }

    private void notifySubs() {
        for (Subscriber subscriber : watchers) {
            subscriber.update(weather);
        }
    }

    public void climateChange(Weathers w) {
        weather = w;
        LOGGER.info("weather change to {}", w);
        notifySubs();
    }
}
