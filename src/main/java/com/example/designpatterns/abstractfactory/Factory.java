package com.example.designpatterns.abstractfactory;

import com.example.designpatterns.builder.Car;
import com.example.designpatterns.builder.Helicopter;

public interface Factory {
    ScrollBar createScrollBar();
    Button createButton();
}
