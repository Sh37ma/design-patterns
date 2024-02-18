package com.example.designpatterns.creationalpatterns.abstractfactory.concrete;

import com.example.designpatterns.creationalpatterns.abstractfactory.ScrollBar;

public class WindowsScrollbar implements ScrollBar {
    @Override
    public void create() {
        System.out.println("Windows scrollBar created");
    }
}
