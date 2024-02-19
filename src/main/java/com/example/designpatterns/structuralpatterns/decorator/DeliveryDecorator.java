package com.example.designpatterns.structuralpatterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeliveryDecorator implements Delivery{

    protected Delivery wrappee;

    @Override
    public void deliver() {
        wrappee.deliver();
    }
}
