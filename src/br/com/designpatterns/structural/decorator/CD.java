package br.com.designpatterns.structural.decorator;

public class CD extends Component {

    public CD(Computer computer) {
        super(computer);
    }

    @Override
    public String getDescription() {
        return wrappedComputer.getDescription() + " + a CD-ROM";
    }
}
