package com.example.designpatterns.behavioralpatterns.observer;

import lombok.Getter;

@Getter
public class Editor {
    private final EventManager eventManager;
    private String fileName;

    public Editor(EventManager eventManager, String fileName) {
        this.eventManager = eventManager;
        this.fileName = fileName;
    }

    public void changeFileName(String newName) {
        fileName = newName;
        eventManager.notifySubscribers(newName);
    }
}
