package com.example.designpatterns.behavioralpatterns.memento;

import lombok.Setter;

@Setter
public class Editor {
    private String text;
    private int cursorX, cursorY;

    public Editor(String text, int cursorX, int cursorY) {
        this.text = text;
        this.cursorX = cursorX;
        this.cursorY = cursorY;
    }

    public SnapShot makeSnapshot() {
        return new SnapShot(this, text, cursorX, cursorY);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", cursorX=" + cursorX +
                ", cursorY=" + cursorY +
                '}';
    }
}
