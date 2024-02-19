package com.example.designpatterns.structuralpatterns.composite;

import com.example.designpatterns.Pattern;

import java.util.List;

public class CompositeClient implements Pattern {
    @Override
    public void triggerPattern() {

        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);

        Package packageChild = new Package(List.of(item1, item2));
        Package packageMain = new Package(List.of(packageChild, item3));

        System.out.println("Full price is: " + packageMain.getPrice());

    }
}
