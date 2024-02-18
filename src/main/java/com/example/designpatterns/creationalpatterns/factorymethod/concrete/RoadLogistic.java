package com.example.designpatterns.creationalpatterns.factorymethod.concrete;

import com.example.designpatterns.creationalpatterns.factorymethod.Logistic;
import com.example.designpatterns.creationalpatterns.factorymethod.Transport;

public class RoadLogistic extends Logistic {

    @Override
    protected Transport createTransport(){
        return new Truck();
    }
}
