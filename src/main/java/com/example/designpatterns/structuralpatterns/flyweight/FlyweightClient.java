package com.example.designpatterns.structuralpatterns.flyweight;

import com.example.designpatterns.Pattern;

public class FlyweightClient implements Pattern {
    @Override
    public void triggerPattern() {
        Forest forest = new Forest();
        forest.plantTree(1,1, "oak", "brown");
        forest.plantTree(1,2, "oak", "brown");
        forest.plantTree(2,1, "oak", "black");
        forest.plantTree(2,2, "oak", "black");
        forest.plantTree(2,3, "birch", "white-black");
        forest.plantTree(3,3, "birch", "white-black");

        forest.drawForest();
    }
}
