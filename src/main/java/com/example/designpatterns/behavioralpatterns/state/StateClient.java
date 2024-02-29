package com.example.designpatterns.behavioralpatterns.state;

import com.example.designpatterns.Pattern;

public class StateClient implements Pattern {
    @Override
    public void triggerPattern() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.setState(new ReadyState(audioPlayer));

        audioPlayer.clickPlay();
        audioPlayer.clickPlay();
        audioPlayer.clickPlay();
        audioPlayer.clickLock();
        audioPlayer.clickNext();
        audioPlayer.clickLock();
        audioPlayer.clickNext();

    }
}
