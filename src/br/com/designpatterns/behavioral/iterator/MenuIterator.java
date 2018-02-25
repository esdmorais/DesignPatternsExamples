package br.com.designpatterns.behavioral.iterator;

import java.util.List;

public class MenuIterator implements Iterator {

    private int current;
    private List<MenuItem> items;

    public MenuIterator(List<MenuItem> items) {
        this.current = 0;
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(current);
        current++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return (current < items.size() && items.get(current) != null);
    }

}
