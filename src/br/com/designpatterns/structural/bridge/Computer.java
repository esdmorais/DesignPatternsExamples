package br.com.designpatterns.structural.bridge;

public abstract class Computer {

    private Monitor monitor;

    public Computer(Monitor screen) {
        this.monitor = screen;
    }

    public abstract String getOperationalSystem();

    public final void turnOn() {
        monitor.showUp("welcome to " + getOperationalSystem());
    }

    public final void turnOff( ) {
        monitor.showUp(getOperationalSystem() + " is shutting down your computer...");
    }

    public final void changeMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
