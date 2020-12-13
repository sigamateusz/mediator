package com.mediator.pattern;

class Fan {
    private final Mediator mediator;

    Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    void turnOn() {
        mediator.start();
    }

    void turnOff() {
        mediator.stop();
    }

    boolean isOn() {
        return mediator.isFanOn();
    }
}
