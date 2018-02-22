package br.com.designpatterns.creational.factorymethod;

public class DeviceFactory {

    public static final String TABLET = "SQL Server";
    public static final String LAPTOP = "Laptop";
    public static final String SMARTPHONE = "Smartphone";

    public Device createDevice(String deviceName) {
        if (LAPTOP.equals(deviceName)) {
            return new LaptopDevice();
        } else if (TABLET.equals(deviceName)) {
            return new TabletDevice();
        } else if (SMARTPHONE.equals(deviceName)) {
            return new SmartphoneDevice();
        } else {
            throw new NullPointerException("invalid device: " + deviceName);
        }
    }
}
