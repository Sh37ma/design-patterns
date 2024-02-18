package com.example.designpatterns.creationalpatterns.builder;


public class Director {

    public void startCreationOfCar(Builder builder){
        builder.startCreation();
        builder.setEngine("v8 engine");
        builder.setType("coupe");
        builder.setDoors("2 light doors");
        builder.setWindows("dim windows");
    }

    public void startCreationOfHelicopter(Builder builder){
        builder.startCreation();
        builder.setEngine("big engine");
        builder.setType("flying");
        builder.setDoors("sliding doors");
        builder.setWindows("reinforced windows");
    }
}
