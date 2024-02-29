package com.example.designpatterns.behavioralpatterns.visitor;

public interface Shape {
    default void move(int x, int y) {
        System.out.println("Move x: " + x + ", y: " + y);
    }

    default void draw(){
        System.out.println("Drawing");
    }

    void accept(Visitor visitor);

}
