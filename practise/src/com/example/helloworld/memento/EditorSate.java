package com.example.helloworld.memento;

public class EditorSate {
    private final String content;

    public EditorSate(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
