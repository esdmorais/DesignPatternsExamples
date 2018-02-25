package br.com.designpatterns.behavioral.command;

public class SendByEmail implements Command {

    @Override
    public void execute(Document document, String... parameters) {
        System.out.println("command send by e-mail");
        System.out.println("e-mail to: " + parameters[0]);
        System.out.println("body: ");
        System.out.println(document.getBody());
        System.out.println();
    }
}
