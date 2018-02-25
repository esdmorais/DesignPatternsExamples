package br.com.designpatterns.structural.bridge;

public class UnixComputer extends Computer {

    public UnixComputer(Monitor screen) {
        super(screen);
    }

    @Override
    public String getOperationalSystem() {
        return "unix";
    }
}
