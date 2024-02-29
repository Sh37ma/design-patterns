package com.example.designpatterns.behavioralpatterns.state;

public class LockState extends State{
    public LockState(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("In lock state");
    }

    @Override
    void clickLock() {
        if (audioPlayer.getState() instanceof PlayingState)
            audioPlayer.changeState(new PlayingState(audioPlayer));
        else
            audioPlayer.changeState(new ReadyState(audioPlayer));
    }

    @Override
    void clickPlay() {
        System.out.println("Locked - Doing nothing");
    }

    @Override
    void clickNext() {
        System.out.println("Locked - Doing nothing");
    }
}
