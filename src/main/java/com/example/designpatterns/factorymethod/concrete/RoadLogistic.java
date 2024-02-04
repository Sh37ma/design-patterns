package com.example.designpatterns.factorymethod.concrete;

import com.example.designpatterns.factorymethod.Logistic;
import com.example.designpatterns.factorymethod.Transport;

public class RoadLogistic extends Logistic {

    @Override
    protected Transport createTransport(){
        return new Truck();
    }
}
