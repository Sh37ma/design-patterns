package com.example.designpatterns.abstractfactory.concrete;

import com.example.designpatterns.abstractfactory.Button;

public class WindowsButton implements Button {
    @Override
    public void create() {
        System.out.println("Windows button created");
    }
}
