package com.mediator.pattern;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Fan fan = new Fan(mediator);
        Button onOffBtn = new Button(mediator);

        setUpMediator(mediator, fan);

        runScript(fan, onOffBtn);
    }

    private static void runScript(Fan fan, Button onOffBtn) {
        printStepSeparator();
        printFanState(fan);
        printStepSeparator();

        onOffBtn.press();
        printFanState(fan);
        printStepSeparator();

        onOffBtn.press();
        printFanState(fan);
        printStepSeparator();
    }

    private static void printFanState(Fan fan) {
        System.out.printf("Is fan on? : %s%n", fan.isOn());
    }

    private static void printStepSeparator() {
        System.out.println("-----------------------------");
    }

    private static void setUpMediator(Mediator mediator, Fan fan) {
        mediator.setFan(fan);
        mediator.setPowerSupplier(new PowerSupplier());
    }
}
