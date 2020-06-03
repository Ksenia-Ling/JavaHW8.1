package ru.netology.conditioner;

public class Conditioner {
    private String nameOfConditioner = "Veterok";
    private int maxTemperature = 35;
    private int minTemperature = 15;
    private int currentTemperature;
    private boolean on;


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

    public void increaseCurrentTemperature() {
        if (isOn()) {
            if (currentTemperature == maxTemperature) {
                return;
            }
            currentTemperature++;
        }

    }

    public void decreaseCurrentTemperature() {
        if (isOn()) {
            if (currentTemperature == minTemperature) {
                return;
            }
            currentTemperature--;
        }
    }
}









