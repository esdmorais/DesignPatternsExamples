package br.com.designpatterns.behavioral.memento;

public class TextBoxMemento {
    private String textState;

    public TextBoxMemento(String textState) {
        this.textState = textState;
    }

    public String getTextState() {
        return textState;
    }
}
