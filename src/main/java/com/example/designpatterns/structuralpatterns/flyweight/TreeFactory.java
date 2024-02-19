package com.example.designpatterns.structuralpatterns.flyweight;


import java.util.ArrayList;
import java.util.List;

public class TreeFactory {
    private static final List<TreeType> list = new ArrayList<>();

    public static TreeType getTreeType(String name, String color) {
        for (TreeType treeType : list) {
            if (treeType.getName().equals(name) && treeType.getColor().equals(color)) {
                return treeType;
            }
        }
        TreeType type = new TreeType(name, color);
        list.add(type);
        return type;
    }
}
