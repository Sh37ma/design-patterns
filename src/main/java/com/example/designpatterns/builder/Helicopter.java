package com.example.designpatterns.builder;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@RequiredArgsConstructor
public class Helicopter {
    private String type;
    private String engine;
    private String doors;
    private String windows;

    @Override
    public String toString() {
        return "Helicopter{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                '}';
    }
}
