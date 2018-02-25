package br.com.designpatterns.structural.adapter;

public class AmericanAdapterPlug extends AmericanPlug {

    private Plug plugToAdapt;

    public AmericanAdapterPlug(Plug plug) {
        this.plugToAdapt = plug;
    }

    @Override
    public String getPlugType() {
        return plugToAdapt.getPlugType();
    }
}
