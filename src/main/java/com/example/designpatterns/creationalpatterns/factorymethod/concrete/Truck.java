package com.example.designpatterns.creationalpatterns.factorymethod.concrete;

import com.example.designpatterns.creationalpatterns.factorymethod.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered in boxes by track");
    }
}
