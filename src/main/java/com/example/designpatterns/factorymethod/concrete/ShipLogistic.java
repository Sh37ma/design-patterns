package com.example.designpatterns.factorymethod.concrete;

import com.example.designpatterns.factorymethod.Logistic;
import com.example.designpatterns.factorymethod.Transport;

public class ShipLogistic extends Logistic {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
