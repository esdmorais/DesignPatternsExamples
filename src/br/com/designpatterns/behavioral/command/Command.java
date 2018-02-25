package br.com.designpatterns.behavioral.command;

public interface Command {

    void execute(Document document, String... parameters);

}
