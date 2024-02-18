package com.example.designpatterns.structuralpatterns.adapter;

import com.example.designpatterns.Pattern;

public class AdapterClient implements Pattern {
    @Override
    public void triggerPattern() {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3);
        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        System.out.println("Could round peg fit in round hole? " + roundHole.fits(roundPeg));

        System.out.println("Could square peg fit in round hole? " + roundHole.fits(squarePegAdapter));
    }
}
