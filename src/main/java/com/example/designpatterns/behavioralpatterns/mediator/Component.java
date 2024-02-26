package com.example.designpatterns.behavioralpatterns.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Component {
    protected final Mediator dialog;

    public void click(){
        dialog.notify(this, "click");
    }

    public void keypress(){
        dialog.notify(this, "keypress");
    }
}
