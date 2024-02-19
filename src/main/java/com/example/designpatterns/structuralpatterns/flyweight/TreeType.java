package com.example.designpatterns.structuralpatterns.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TreeType {
    private String name;
    private String color;

    @Override
    public String toString() {
        return "TreeType{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
