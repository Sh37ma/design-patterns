package com.example.designpatterns.behavioralpatterns.visitor;

public class Dot implements Shape {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
