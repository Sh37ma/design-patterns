package com.example.designpatterns.behavioralpatterns.visitor;

import com.example.designpatterns.Pattern;

import java.util.List;

public class VisitorClient implements Pattern {
    @Override
    public void triggerPattern() {
        List<Shape> shapes = List.of(new Dot(), new Circle(), new CompoundShape());
        Visitor visitor = new XMLExportVisitor();
        shapes.forEach(shape -> shape.accept(visitor));
    }
}
