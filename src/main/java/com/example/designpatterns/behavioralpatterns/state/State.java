package com.example.designpatterns.behavioralpatterns.state;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class State {
    protected AudioPlayer audioPlayer;

    abstract void clickLock();
    abstract void clickPlay();
    abstract void clickNext();
}
