package com.example.designpatterns.factorymethod.concrete;

import com.example.designpatterns.factorymethod.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered in container by ship");
    }
}
