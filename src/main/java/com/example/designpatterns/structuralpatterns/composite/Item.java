package com.example.designpatterns.structuralpatterns.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item implements Element {
    private int price;

    public int getPrice() {
        System.out.println("In item with price: " + price);
        return price;
    }
}
