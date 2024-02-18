package com.example.designpatterns.structuralpatterns.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TV implements Device {
    private boolean enabled;
    private int volume;
    private int channel;
}
