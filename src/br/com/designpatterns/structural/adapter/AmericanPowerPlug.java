package br.com.designpatterns.structural.adapter;

public class AmericanPowerPlug {

    private AmericanPlug connectedPlug;

    private static final int NUMBER_OF_SOCKETS = 2;

    public void connect(AmericanPlug plug) {
        if (NUMBER_OF_SOCKETS == plug.getNumberOfSockets()) {
            System.out.println("the " + plug.getPlugType() + " plug has just connected");
            this.connectedPlug = plug;
        } else {
            System.out.println("this plug does not fit");
        }
    }

    public void disconnect() {
        if (connectedPlug == null) {
            System.out.println("there is no connected plug");
        } else {
            System.out.println("the " + connectedPlug.getPlugType() + " plug has been disconnected");
            this.connectedPlug = null;
        }
    }
}
