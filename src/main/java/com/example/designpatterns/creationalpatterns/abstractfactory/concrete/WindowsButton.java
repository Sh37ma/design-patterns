package com.example.designpatterns.creationalpatterns.abstractfactory.concrete;

import com.example.designpatterns.creationalpatterns.abstractfactory.Button;

public class WindowsButton implements Button {
    @Override
    public void create() {
        System.out.println("Windows button created");
    }
}
