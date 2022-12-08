package com.example.helloworld.memento;

public class Editor {
    private String content;

    public EditorSate createState() {
        return new EditorSate(content);
    }

    public void restore(EditorSate state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
