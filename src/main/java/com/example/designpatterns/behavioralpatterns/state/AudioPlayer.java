package com.example.designpatterns.behavioralpatterns.state;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AudioPlayer {
    private State state;

    public void changeState(State newState){
        this.state = newState;
    }

    public void clickLock(){
        state.clickLock();
    }
    public void clickPlay(){
        state.clickPlay();
    }
    public void clickNext(){
        state.clickNext();
    }

    public void nextSong() {
        System.out.println("Switching songs");
    }
}
