package br.com.designpatterns.behavioral.memento;

public class TextBox {
    private String texto;
    private TextBoxCaretaker caretaker;
 
    public TextBox() {
        caretaker = new TextBoxCaretaker();
        texto = new String();
    }
 
    public void writeText(String novoTexto) {
        caretaker.addMemento(new TextBoxMemento(texto));
        texto += novoTexto;
    }
 
    public void undoWrite() {
        texto = caretaker.getLastState().getTextState();
    }
 
    public void showText() {
        System.out.println(texto);
    }
}