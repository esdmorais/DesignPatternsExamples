package br.com.designpatterns.structural.bridge;

public class WindowsComputer extends Computer {

    public WindowsComputer(Monitor screen) {
        super(screen);
    }

    @Override
    public String getOperationalSystem() {
        return "windows 10";
    }

}
