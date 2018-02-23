package br.com.designpatterns.creational.abstractfactory.factory;

import br.com.designpatterns.creational.abstractfactory.laptop.Laptop;
import br.com.designpatterns.creational.abstractfactory.laptop.ZenBook;
import br.com.designpatterns.creational.abstractfactory.smartphone.Smartphone;
import br.com.designpatterns.creational.abstractfactory.smartphone.Zenfone3;
import br.com.designpatterns.creational.abstractfactory.tablet.Tablet;
import br.com.designpatterns.creational.abstractfactory.tablet.ZenTablet;

public class AsusFactory implements DeviceFactory {

    @Override
    public Smartphone createSmartphone() {
        return new Zenfone3();
    }

    @Override
    public Laptop createLaptop() {
        return new ZenBook();
    }

    @Override
    public Tablet createTablet() {
        return new ZenTablet();
    }

}
