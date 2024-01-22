package com.example.designpatterns.builder;

public class HelicopterBuilder implements Builder{

    private Helicopter helicopter;

    public Helicopter getResult(){
        return this.helicopter;
    }

    @Override
    public void startCreation() {
        helicopter = new Helicopter();
    }

    @Override
    public void setType(String type) {
        helicopter.setType(type);
    }

    @Override
    public void setEngine(String engine) {
        helicopter.setEngine(engine);
    }

    @Override
    public void setDoors(String doors) {
        helicopter.setDoors(doors);
    }

    @Override
    public void setWindows(String windows) {
        helicopter.setWindows(windows);
    }
}
