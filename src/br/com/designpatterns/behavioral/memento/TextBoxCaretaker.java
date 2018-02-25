package br.com.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class TextBoxCaretaker {
    private List<TextBoxMemento> states;

    public TextBoxCaretaker() {
        states = new ArrayList<TextBoxMemento>();
    }

    public void addMemento(TextBoxMemento memento) {
        states.add(memento);
    }

    public TextBoxMemento getLastState() {
        if (states.size() <= 0) {
            return new TextBoxMemento("");
        }

        TextBoxMemento saveState = states.get(states.size() - 1);
        states.remove(saveState);

        return saveState;
    }
}
