package com.example.designpatterns.behavioralpatterns.observer;

public class LoggingListener implements EventListener {
    @Override
    public void update(String fileName) {
        System.out.println("Logging Listener got file name: " + fileName);
    }
}
