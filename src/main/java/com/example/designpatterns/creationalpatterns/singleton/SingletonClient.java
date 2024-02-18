package com.example.designpatterns.creationalpatterns.singleton;

import com.example.designpatterns.Pattern;

public class SingletonClient implements Pattern {
    @Override
    public void triggerPattern() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        boolean result = singleton == singleton2;

        System.out.println("Is singleton1 - " + singleton + "\nthe same instance as singleton2 - " + singleton2 + "\n" + result);
    }
}
