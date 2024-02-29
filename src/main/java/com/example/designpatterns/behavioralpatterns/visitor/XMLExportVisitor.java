package com.example.designpatterns.behavioralpatterns.visitor;

public class XMLExportVisitor implements Visitor{
    @Override
    public void visitDot(Dot dot) {
        System.out.println("Export Dot: " + dot);
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Export circle: " + circle);
    }

    @Override
    public void visitCompoundShape(CompoundShape compoundShape) {
        System.out.println("Export compoundShape: " + compoundShape);
    }
}
