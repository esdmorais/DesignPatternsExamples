package br.com.designpatterns.behavioral.command;

public class SavePDF implements Command {

    @Override
    public void execute(Document document, String... parameters) {
        System.out.println("command save PDF file ");
        System.out.println("document saved as: " + parameters[1] + "\\" + parameters[0]);
        System.out.println("body of the PDF file is: ");
        System.out.println(document.getBody());
    }
}
