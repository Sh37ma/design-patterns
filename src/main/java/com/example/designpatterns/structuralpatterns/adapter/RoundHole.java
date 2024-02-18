package com.example.designpatterns.structuralpatterns.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RoundHole {
    private double holeRadius;

    public boolean fits(RoundPeg roundPeg) {
        return roundPeg.getRadius() <= holeRadius;
    }
}
