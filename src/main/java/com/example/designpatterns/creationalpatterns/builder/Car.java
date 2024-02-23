package com.example.designpatterns.creationalpatterns.builder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Car {
    private String type;
    private String engine;
    private String doors;
    private String windows;

    public Car(String type, String engine, String doors, String windows) {
        this.type = type;
        this.engine = engine;
        this.doors = doors;
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                '}';
    }
}
