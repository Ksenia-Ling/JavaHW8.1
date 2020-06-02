package ru.netology.conditioner;

public class Conditioner {
    private String Veterok;
    private int maxTemperature = 35;
    private int minTemperature = 15;
    private int currentTemperature;
    private boolean on;

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        if (isOn()) {
            currentTemperature++;
        }
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        if (isOn()) {
            currentTemperature--;
        }
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
    public int getCurrentTemperature() {
        return currentTemperature;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

}







