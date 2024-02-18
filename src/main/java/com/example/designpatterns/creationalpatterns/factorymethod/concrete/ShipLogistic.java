package com.example.designpatterns.creationalpatterns.factorymethod.concrete;

import com.example.designpatterns.creationalpatterns.factorymethod.Logistic;
import com.example.designpatterns.creationalpatterns.factorymethod.Transport;

public class ShipLogistic extends Logistic {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
