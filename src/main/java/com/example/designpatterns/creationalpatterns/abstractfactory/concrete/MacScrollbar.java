package com.example.designpatterns.creationalpatterns.abstractfactory.concrete;

import com.example.designpatterns.creationalpatterns.abstractfactory.ScrollBar;

public class MacScrollbar implements ScrollBar {
    @Override
    public void create() {
        System.out.println("Mac scrollBar created");
    }
}
