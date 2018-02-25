package br.com.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class VirtualChatRoom implements ChatRoom {

    private Map<String, Person> participants;

    public VirtualChatRoom() {
        this.participants = new HashMap<String, Person>();
    }

    @Override
    public void join(Person person) {
        if (!participants.containsKey(person.getName())) {
            participants.put(person.getName(), person);
        }
        person.setChatRoom(this);
    }

    @Override
    public void sendMessage(String from, String to, String message) {
        Person pessoa = participants.get(to);
        pessoa.receiveMessage(from, message);
    }

}
