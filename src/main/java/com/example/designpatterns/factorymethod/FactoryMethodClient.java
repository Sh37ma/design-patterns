package com.example.designpatterns.factorymethod;

import com.example.designpatterns.Pattern;
import com.example.designpatterns.factorymethod.concrete.RoadLogistic;
import com.example.designpatterns.factorymethod.concrete.ShipLogistic;

public class FactoryMethodClient implements Pattern {
    public void triggerPattern() {
    Logistic logistic = new ShipLogistic();
    logistic.startTransporting();
    }
}
