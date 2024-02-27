package com.example.designpatterns.behavioralpatterns.observer;

public class EmailListener implements EventListener{
    @Override
    public void update(String fileName) {
        System.out.println("Email listener got new file name: " + fileName);
    }
}
