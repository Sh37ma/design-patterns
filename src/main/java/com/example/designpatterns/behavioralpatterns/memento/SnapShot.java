package com.example.designpatterns.behavioralpatterns.memento;

public class SnapShot {
    private final Editor editor;
    private final String text;
    private final int cursorX, cursorY;

    public SnapShot(Editor editor, String text, int cursorX, int cursorY) {
        this.editor = editor;
        this.text = text;
        this.cursorX = cursorX;
        this.cursorY = cursorY;
    }

    public void restore() {
        editor.setText(this.text);
        editor.setCursorX(this.cursorX);
        editor.setCursorY(this.cursorY);
    }
}
