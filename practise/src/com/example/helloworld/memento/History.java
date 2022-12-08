package com.example.helloworld.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorSate> states = new ArrayList<>();

    public void push(EditorSate state) {
        states.add(state);
    }

    public EditorSate pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
