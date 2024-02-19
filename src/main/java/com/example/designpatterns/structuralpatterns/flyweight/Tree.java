package com.example.designpatterns.structuralpatterns.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {
    private int x, y;
    private TreeType treeType;

    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "x=" + x +
                ", y=" + y +
                ", treeType=" + treeType +
                '}';
    }
}
