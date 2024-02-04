package com.example.designpatterns.abstractfactory.concrete;

import com.example.designpatterns.abstractfactory.ScrollBar;

public class WindowsScrollbar implements ScrollBar {
    @Override
    public void create() {
        System.out.println("Windows scrollBar created");
    }
}
