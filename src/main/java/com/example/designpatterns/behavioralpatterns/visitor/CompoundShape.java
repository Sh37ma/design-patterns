package com.example.designpatterns.behavioralpatterns.visitor;

public class CompoundShape implements Shape {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}
