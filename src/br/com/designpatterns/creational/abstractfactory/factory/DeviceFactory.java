package br.com.designpatterns.creational.abstractfactory.factory;

import br.com.designpatterns.creational.abstractfactory.laptop.Laptop;
import br.com.designpatterns.creational.abstractfactory.smartphone.Smartphone;
import br.com.designpatterns.creational.abstractfactory.tablet.Tablet;

public interface DeviceFactory {
    Smartphone createSmartphone();

    Laptop createLaptop();

    Tablet createTablet();
}
