package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.Pattern;
import com.example.designpatterns.abstractfactory.concrete.MacFactory;

public class AbstractFactoryClient implements Pattern {

    public void triggerPattern() {
        Factory factory = new MacFactory();
        Button button = factory.createButton();
        ScrollBar scrollBar = factory.createScrollBar();


        System.out.println("Button ->");
        button.create();

        System.out.println("ScrollBar ->");
        scrollBar.create();
    }
}
