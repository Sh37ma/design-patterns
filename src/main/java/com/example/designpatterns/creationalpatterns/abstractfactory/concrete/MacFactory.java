package com.example.designpatterns.creationalpatterns.abstractfactory.concrete;

import com.example.designpatterns.creationalpatterns.abstractfactory.Button;
import com.example.designpatterns.creationalpatterns.abstractfactory.Factory;
import com.example.designpatterns.creationalpatterns.abstractfactory.ScrollBar;

public class MacFactory implements Factory {
    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollbar();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
