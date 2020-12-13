package com.mediator.pattern;

class Button {
    private final Mediator mediator;

    Button(Mediator mediator) {
        this.mediator = mediator;
    }

    void press() {
        mediator.press();
    }
}
