package com.example.designpatterns.behavioralpatterns.memento;

import java.util.Stack;

public class SnapShotHistory {
    private final Stack<SnapShot> history;

    public SnapShotHistory() {
        this.history = new Stack<>();
    }

    public void makeBackup(SnapShot snapShot) {
        history.push(snapShot);
    }

    public SnapShot undo() {
        return history.pop();
    }
}
