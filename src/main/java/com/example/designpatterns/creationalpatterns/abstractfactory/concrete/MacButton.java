package com.example.designpatterns.creationalpatterns.abstractfactory.concrete;

import com.example.designpatterns.creationalpatterns.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void create() {
        System.out.println("Mac button created");
    }
}
