package br.com.designpatterns.structural.bridge;

public class UseBridge {

    public static void main(String[] args) {
        Monitor lcdMonitor = new LCDMonitor();
        Computer windowsComputer = new WindowsComputer(lcdMonitor);
        windowsComputer.turnOn();
        windowsComputer.turnOff();

        Monitor crtMonitor = new CRTMonitor();
        windowsComputer.changeMonitor(crtMonitor);
        windowsComputer.turnOn();
        windowsComputer.turnOff();

        Computer unixComputer = new UnixComputer(lcdMonitor);
        unixComputer.turnOn();
        unixComputer.turnOff();

        unixComputer.changeMonitor(crtMonitor);
        unixComputer.turnOn();
        unixComputer.turnOff();
    }
}
