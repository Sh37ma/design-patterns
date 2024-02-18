package com.example.designpatterns.creationalpatterns.factorymethod.concrete;

import com.example.designpatterns.creationalpatterns.factorymethod.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered in container by ship");
    }
}
