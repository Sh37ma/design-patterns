package com.example.designpatterns.abstractfactory.concrete;

import com.example.designpatterns.abstractfactory.Button;
import com.example.designpatterns.abstractfactory.Factory;
import com.example.designpatterns.abstractfactory.ScrollBar;

public class WindowsFactory implements Factory {
    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollbar();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
