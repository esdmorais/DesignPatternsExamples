package br.com.designpatterns.behavioral.command;

public class Document {

    private String body;

    public Document(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
