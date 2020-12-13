package com.mediator.pattern;

class PowerSupplier {
    private boolean turnedOn = false;

    boolean isTurnedOn() {
        return turnedOn;
    }

    void turnOn() {
        System.out.println("Turn on power supplier");
        toggleTurnOn();
    }

    void turnOff() {
        System.out.println("Turn off power supplier");
        toggleTurnOn();
    }

    void toggleTurnOn() {
        this.turnedOn = !this.turnedOn;
    }
}
