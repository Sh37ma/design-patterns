package com.example.designpatterns.behavioralpatterns.templatemethod;

public class ElfsCivilization extends Civilization{

    public ElfsCivilization() {
        super("Elf's");
    }

    @Override
    protected void gatherResources() {
        System.out.println("Gathering fruits");
    }

    @Override
    protected void attack() {
        System.out.println("Elf's archers and riders attack");
    }
}
