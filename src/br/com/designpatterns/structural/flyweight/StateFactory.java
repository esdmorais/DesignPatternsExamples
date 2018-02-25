package br.com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StateFactory {

    private static final Map<String, State> STATES;
    static {
        STATES = new HashMap<String, State>();
    }

    public static State getState(String name) {
        if (!STATES.containsKey(name)) {
            State state = new State(name);
            STATES.put(name, state);
        }
        return STATES.get(name);
    }

    public static int getNumberOfStates() {
        return STATES.size();
    }
}
