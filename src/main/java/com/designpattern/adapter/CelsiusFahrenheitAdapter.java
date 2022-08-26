package com.designpattern.adapter;

public class CelsiusFahrenheitAdapter implements Temperature {
    private Temperature meter;

    public CelsiusFahrenheitAdapter(Temperature meter) {
        this.meter = meter;
    }

    // (32°F − 32) × 5/9 = 0°C
    public Integer convert(Temperature meter) {
        if (meter instanceof CelsiusMeter) {
            return meter.getTemperature() * 9 / 5 + 32;
        } else if (meter instanceof FahrenheitMeter) {
            return (meter.getTemperature() - 32) * 5 / 9;
        }
        return 0;
    }

    @Override
    public Integer getTemperature() {
        return this.convert(meter);
    }

}
