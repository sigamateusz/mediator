package com.mediator.pattern;

class Mediator {
    private Fan fan;
    private PowerSupplier powerSupplier;

    void setFan(Fan fan) {
        this.fan = fan;
    }

    void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    void press() {
        if (powerSupplier.isTurnedOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    void start() {
        powerSupplier.turnOn();
    }

    void stop() {
        powerSupplier.turnOff();
    }

    boolean isFanOn() {
        return powerSupplier.isTurnedOn();
    }
}
