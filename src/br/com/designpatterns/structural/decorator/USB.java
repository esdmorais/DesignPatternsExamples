package br.com.designpatterns.structural.decorator;

public class USB extends Component {

    public USB(Computer computador) {
        super(computador);
    }

    @Override
    public String getDescription() {
        return wrappedComputer.getDescription() + " + a USB connection ";
    }

}
