package br.com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class UseIterator {

    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();

        menuItems.add(new MenuItem("Item A"));
        menuItems.add(new MenuItem("Item B"));
        menuItems.add(new MenuItem("Item C"));
        menuItems.add(new MenuItem("Item B"));

        System.out.println("starting the iterator...");

        Iterator menuIterator = new MenuIterator(menuItems);
        while (menuIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) menuIterator.next();
            System.out.println(menuItem.getName());
        }
    }
}