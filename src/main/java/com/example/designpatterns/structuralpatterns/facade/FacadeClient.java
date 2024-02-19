package com.example.designpatterns.structuralpatterns.facade;

import com.example.designpatterns.Pattern;

public class FacadeClient implements Pattern {
    @Override
    public void triggerPattern() {
        new OrderFacade().placeOrder();
    }
}
