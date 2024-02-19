package com.example.designpatterns.structuralpatterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeliverySystem implements Delivery{
    private String address;
    @Override
    public void deliver() {
        System.out.println("Package was delivered to address: " + address);
    }
}
