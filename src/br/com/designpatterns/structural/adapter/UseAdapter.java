package br.com.designpatterns.structural.adapter;

public class UseAdapter {

    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug();
        BrazilianPlug brazilianPlug = new BrazilianPlug();

        AmericanPowerPlug americanPowerPlug = new AmericanPowerPlug();
        americanPowerPlug.connect(americanPlug);
        americanPowerPlug.disconnect();

        // It can't be possible!
        // americanPowerPlug.connect(brazilianPlug);

        AmericanAdapterPlug americanAdapter = new AmericanAdapterPlug(brazilianPlug);
        americanPowerPlug.connect(americanAdapter);
        americanPowerPlug.disconnect();
    }
}
