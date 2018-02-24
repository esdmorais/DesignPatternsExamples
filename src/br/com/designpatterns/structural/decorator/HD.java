package br.com.designpatterns.structural.decorator;

public class HD extends Component {

    public HD(Computer computador) {
        super(computador);
    }

    @Override
    public String getDescription() {
        return wrappedComputer.getDescription() + " + a hard disk";
    }
}
