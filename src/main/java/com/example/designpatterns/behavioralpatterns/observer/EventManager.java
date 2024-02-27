package com.example.designpatterns.behavioralpatterns.observer;


import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<EventListener> subscribers;

    public EventManager() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
        subscribers.add(listener);
    }

    public void unSubscribe(EventListener listener) {
        subscribers.remove(listener);
    }

    public void notifySubscribers(String fileName){
        subscribers.forEach(s -> s.update(fileName));
    }
}
