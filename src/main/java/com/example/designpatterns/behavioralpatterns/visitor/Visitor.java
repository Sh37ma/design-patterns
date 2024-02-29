package com.example.designpatterns.behavioralpatterns.visitor;

public interface Visitor {
    void visitDot(Dot dot);

    void visitCircle(Circle circle);

    void visitCompoundShape(CompoundShape compoundShape);
}
