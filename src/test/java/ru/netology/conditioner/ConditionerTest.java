package ru.netology.conditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(true);
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        int expected = 23;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

    }
    @Test
    public void increaseTemperatureOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(33);
        conditioner.setOn(true);
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        int expected = 35;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseTemperatureIfVeterokIsOff() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(false);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 20;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        int expected = 18;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

    }
    @Test
    public void decreaseTemperatureUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(16);
        conditioner.setOn(true);
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

    }
    @Test
    public void decreaseTemperatureIfVeterokIsOff() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setOn(false);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected, actual);

    }
}