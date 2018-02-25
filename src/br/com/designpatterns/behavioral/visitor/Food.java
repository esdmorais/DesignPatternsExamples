package br.com.designpatterns.behavioral.visitor;

public interface Food {
    public abstract void accept(Calculator visitor);
}