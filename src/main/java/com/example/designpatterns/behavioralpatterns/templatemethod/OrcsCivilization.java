package com.example.designpatterns.behavioralpatterns.templatemethod;

public class OrcsCivilization extends Civilization{

    public OrcsCivilization() {
        super("Orcs");
    }

    @Override
    protected void gatherResources() {
        System.out.println("Gathering meat");
    }

    @Override
    protected void attack() {
        System.out.println("Wargs and orcs are attacking");
    }
}
