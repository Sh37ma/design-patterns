package com.example.designpatterns.behavioralpatterns.templatemethod;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Civilization {
protected String civilizationName;
    void turn(){
        gatherResources();
        moveArmy();
        attack();
    }

    protected abstract void gatherResources();
    private void moveArmy() {
        System.out.println(civilizationName + " army is moving");
    }
    protected abstract void attack();
}
