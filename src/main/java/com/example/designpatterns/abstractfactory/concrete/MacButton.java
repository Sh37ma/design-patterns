package com.example.designpatterns.abstractfactory.concrete;

import com.example.designpatterns.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void create() {
        System.out.println("Mac button created");
    }
}
