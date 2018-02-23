package br.com.designpatterns.creational.abstractfactory.factory;

import br.com.designpatterns.creational.abstractfactory.laptop.Laptop;
import br.com.designpatterns.creational.abstractfactory.laptop.MacBook;
import br.com.designpatterns.creational.abstractfactory.smartphone.IPhone;
import br.com.designpatterns.creational.abstractfactory.smartphone.Smartphone;
import br.com.designpatterns.creational.abstractfactory.tablet.IPad;
import br.com.designpatterns.creational.abstractfactory.tablet.Tablet;

public class AppleFactory implements DeviceFactory {

    @Override
    public Smartphone createSmartphone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }

    @Override
    public Tablet createTablet() {
        return new IPad();
    }

}
