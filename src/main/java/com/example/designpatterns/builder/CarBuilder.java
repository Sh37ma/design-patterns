package com.example.designpatterns.builder;


public class CarBuilder implements Builder{

    private Car car;

    public Car getResult(){
        return car;
    }

    @Override
    public void startCreation() {
        car = new Car();
    }

    @Override
    public void setType(String type) {
        car.setType(type);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setDoors(String doors) {
        car.setDoors(doors);
    }

    @Override
    public void setWindows(String windows) {
        car.setWindows(windows);
    }
}
