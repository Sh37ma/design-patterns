package com.example.designpatterns.behavioralpatterns.templatemethod;

import com.example.designpatterns.Pattern;

public class TemplateMethodClient implements Pattern {
    @Override
    public void triggerPattern() {
//        Civilization civilization = new OrcsCivilization();
        Civilization civilization = new ElfsCivilization();
        civilization.turn();
    }
}
