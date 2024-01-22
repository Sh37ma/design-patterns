package com.example.designpatterns.builder;

public interface Builder {
    void startCreation();
    void setType(String type);
    void setEngine(String engine);
    void setDoors(String doors);
    void setWindows(String windows);
}
