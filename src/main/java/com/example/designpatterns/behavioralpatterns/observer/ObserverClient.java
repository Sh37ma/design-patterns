package com.example.designpatterns.behavioralpatterns.observer;

import com.example.designpatterns.Pattern;

public class ObserverClient implements Pattern {
    @Override
    public void triggerPattern() {
        EventManager eventManager = new EventManager();
        Editor editor = new Editor(eventManager, "start value");

        EmailListener emailListener = new EmailListener();
        LoggingListener loggingListener = new LoggingListener();

        eventManager.subscribe(emailListener);
        eventManager.subscribe(loggingListener);

        System.out.println(editor.getFileName());
        editor.changeFileName("value 2");
        editor.changeFileName("value 3");
        editor.changeFileName("value 4");
    }
}
