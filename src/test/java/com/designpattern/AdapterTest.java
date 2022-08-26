package com.designpattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.designpattern.adapter.CelsiusFahrenheitAdapter;
import com.designpattern.adapter.CelsiusMeter;
import com.designpattern.adapter.FahrenheitMeter;

public class AdapterTest {
    final static Logger LOGGER = LoggerFactory.getLogger(AdapterTest.class);

    @Test
    public void temperatureShouldAdaptToOtherType() {
        Integer testCelsiusDegree = 30;
        Integer testFahrenheitDegree = 86;
        CelsiusMeter celsiusMeter = new CelsiusMeter(1l, "A celsius temperature meter", testCelsiusDegree);
        FahrenheitMeter fahrenheitMeter = new FahrenheitMeter(2l, "A Fahrenheit temperature meter",
                testFahrenheitDegree);
        LOGGER.info("Temperature in Celsius: " + celsiusMeter.getTemperature().toString());
        LOGGER.info("Temperature in Celsius: " + fahrenheitMeter.getTemperature().toString());
        CelsiusFahrenheitAdapter cAdapter = new CelsiusFahrenheitAdapter(celsiusMeter);
        CelsiusFahrenheitAdapter fAdapter = new CelsiusFahrenheitAdapter(fahrenheitMeter);
        LOGGER.info(cAdapter.getTemperature().toString());
        assertEquals(testFahrenheitDegree, cAdapter.getTemperature());
        LOGGER.info(fAdapter.getTemperature().toString());
        assertEquals(testCelsiusDegree, fAdapter.getTemperature());

    }

}
