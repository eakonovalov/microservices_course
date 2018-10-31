package com.eakonovalov.limitsservice.bean;

import org.springframework.stereotype.Component;

/**
 * Created by ekonovalov on 2018-10-04.
 */
@Component
public class LimitConfiguration {

    private int minimum;
    private int maximum;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

}
