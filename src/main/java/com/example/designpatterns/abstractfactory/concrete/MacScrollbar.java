package com.example.designpatterns.abstractfactory.concrete;

import com.example.designpatterns.abstractfactory.ScrollBar;

public class MacScrollbar implements ScrollBar {
    @Override
    public void create() {
        System.out.println("Mac scrollBar created");
    }
}
