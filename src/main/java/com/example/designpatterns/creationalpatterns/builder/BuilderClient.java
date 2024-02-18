package com.example.designpatterns.creationalpatterns.builder;

import com.example.designpatterns.Pattern;

public class BuilderClient implements Pattern {

    public void triggerPattern() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        HelicopterBuilder heliBuilder = new HelicopterBuilder();

        System.out.println("Build car ->");
        director.startCreationOfCar(carBuilder);
        System.out.println(carBuilder.getResult());

        System.out.println("Build heli ->");
        director.startCreationOfHelicopter(heliBuilder);
        System.out.println(heliBuilder.getResult());
    }
}
