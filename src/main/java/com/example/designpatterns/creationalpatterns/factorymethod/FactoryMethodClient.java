package com.example.designpatterns.creationalpatterns.factorymethod;

import com.example.designpatterns.Pattern;
import com.example.designpatterns.creationalpatterns.factorymethod.concrete.ShipLogistic;

public class FactoryMethodClient implements Pattern {
    public void triggerPattern() {
    Logistic logistic = new ShipLogistic();
    logistic.startTransporting();
    }
}
