package com.kc.mylearnings.springcloud.mircoservices.limitservice.bean;

public class LimitConfiguration {
    private int minimum;
    private int maximum;

    protected LimitConfiguration() {
    }

    public LimitConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
