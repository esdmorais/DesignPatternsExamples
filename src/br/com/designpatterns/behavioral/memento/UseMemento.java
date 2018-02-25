package br.com.designpatterns.behavioral.memento;

public class UseMemento {

    public static void main(String[] args) {
        TextBox texto = new TextBox();
        texto.writeText("first text line\n");
        texto.writeText("second text line\n");
        texto.writeText("thrid text line\n");
        texto.showText();

        texto.undoWrite();
        texto.showText();

        texto.undoWrite();
        texto.showText();

        texto.writeText("another one text line\n");
        texto.showText();

        texto.undoWrite();
        texto.showText();

        texto.undoWrite();
        texto.showText();
    }
}
