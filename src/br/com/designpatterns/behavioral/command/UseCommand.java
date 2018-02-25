package br.com.designpatterns.behavioral.command;

public class UseCommand {
    public static void main(String[] args) {
        Document document = new Document("this is my brand new document");

        Command command = new SendByEmail();
        command.execute(document, "phoebe@designpatterns.com");

        command = new SavePDF();
        command.execute(document, "Definition.pdf", "C:\\Users\\Phoebe");
    }
}
