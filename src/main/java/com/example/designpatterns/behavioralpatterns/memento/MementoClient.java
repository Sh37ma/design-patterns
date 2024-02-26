package com.example.designpatterns.behavioralpatterns.memento;

import com.example.designpatterns.Pattern;

public class MementoClient implements Pattern {
    @Override
    public void triggerPattern() {
        SnapShotHistory history = new SnapShotHistory();
        Editor editor = new Editor("text", 0 ,0);
        System.out.println(editor);

        history.makeBackup(editor.makeSnapshot());
        editor.setText("changed");
        System.out.println(editor);

        history.undo().restore();
        System.out.println(editor);

        history.makeBackup(editor.makeSnapshot());
        editor.setText("new stuff");
        editor.setCursorX(123);
        editor.setCursorY(987);
        System.out.println(editor);

        history.undo().restore();
        System.out.println(editor);
    }
}
