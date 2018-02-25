package br.com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ShippingManager {

    private List<Shipping> shippingPool;

    public ShippingManager() {
        this.shippingPool = new ArrayList<Shipping>();
    }

    public void generateShipping(String item, String address, String stateName) {
        State state = StateFactory.getState(stateName);
        shippingPool.add(new Shipping(item, address, state));
    }
}
