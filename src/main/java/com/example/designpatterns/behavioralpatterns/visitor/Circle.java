package com.example.designpatterns.behavioralpatterns.visitor;

public class Circle implements Shape {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
